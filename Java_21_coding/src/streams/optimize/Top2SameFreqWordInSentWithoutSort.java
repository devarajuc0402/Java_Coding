package streams.optimize;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Top2SameFreqWordInSentWithoutSort {

	public static void main(String[] args) {
		
		String s = "Java is great. Java is powerful, and Java is popular! Spring is great. Spring Spring Spring Boot cloud Boot cloud Boot cloud ";
		System.out.println(s);
		String st = s.toLowerCase()
				.replaceAll("[^a-zA-Z0-9\\s]", "")
				.trim();
		
		String[] str = st.isEmpty() ? new String[0] :
				st.split("\\s+");
		
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
						firstMax.map(a -> a.getValue()).orElse(0L)
				))
				.max(Map.Entry.comparingByValue());
		
		List<Entry<String, Long>> res2 = res1.entrySet()
				.stream()
				.filter(ss -> ss.getValue().equals( 
				firstMax.map(a -> a.getValue()).orElse(0L)) ||
				ss.getValue().equals(
					secondMax.map(a -> a.getValue()).orElse(0L))
				)
				.collect(Collectors.toList());

		System.out.println(res1);
		System.out.println(firstMax);
		System.out.println(secondMax);
		System.out.println(res2);
	}
}
