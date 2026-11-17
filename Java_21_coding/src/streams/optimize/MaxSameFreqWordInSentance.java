package streams.optimize;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxSameFreqWordInSentance {

	public static void main(String[] args) {
		
//		String s = "Java is great. Java is powerful, and Java is popular!";
		String s = "Java is great. Java is powerful, and Java is popular! Spring is great.";
		System.out.println(s);
		String st = s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(st);
		
		String[] str = st.isEmpty() ? new String[0] : s.split(" ");
		System.out.println(Arrays.toString(str));
		
		Map<String, Long> res1 = Arrays.stream(str)
				.collect(Collectors.groupingBy(
						ss -> ss,
						LinkedHashMap::new,
						Collectors.counting()
				));
		
		Optional<Entry<String, Long>> max = res1.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue());
				
		List<Entry<String, Long>> res2 = res1.entrySet()
				.stream()
				.filter(ss -> ss.getValue() == max.map(e -> e.getValue()).orElse(0L))
				.collect(Collectors.toList());
		
		System.out.println(res1);
		System.out.println(max);
		System.out.println(res2);
		
	}
}
