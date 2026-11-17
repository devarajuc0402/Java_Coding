package streams.optimize;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Top2FreqWordInSentWithoutSort {

	public static void main(String[] args) {
		
		String s = "Java is great. Java is powerful, and Java is popular! Spring is great.";
		System.out.println(s);
		String st = s.toLowerCase()
				.replaceAll("[^a-zA-Z0-9\\s]", "")
				.trim();
		System.out.println(st);
		
		String[] str = st.isEmpty() ? new String[0] : st.split("\\s+");
		System.out.println(Arrays.toString(str));	
		
		Map<String, Long> res1 = Arrays.stream(str)
				.collect(Collectors.groupingBy(
						ss -> ss,
						LinkedHashMap::new,
						Collectors.counting()
				));
		
		Optional<Entry<String, Long>> firstMax = res1.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue());
		
		Optional<Entry<String, Long>> secondMax = res1.entrySet()
				.stream()
				.filter(e -> !e.getValue().equals( 
						firstMax.map(a -> a.getValue()).orElse(0L))
						)
				.max(Map.Entry.comparingByValue());
		
		
		System.out.println(res1);
		System.out.println(firstMax);
		System.out.println(secondMax);
	}
}
