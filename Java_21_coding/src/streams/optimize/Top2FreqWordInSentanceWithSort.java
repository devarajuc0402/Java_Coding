package streams.optimize;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Top2FreqWordInSentanceWithSort {

	public static void main(String[] args) {
	
		String s = "Java is great. Java is powerful, and Java is popular! Spring is great.";
		System.out.println(s);
		String st = s.toLowerCase()
				.replaceAll("[^[a-zA-Z0-9]\\s+]", "")
				.trim();
		System.out.println(st);
		
		String[] str = st.isEmpty() ? new String[0] : st.split(" ");
		
		Map<String, Long> res1 = Arrays.stream(str)
				.collect(Collectors.groupingBy(
						ss -> ss,
						LinkedHashMap::new,
						Collectors.counting()
				));
		
		List<Long> top2Count = res1.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.map(e -> e.getValue())
				.distinct()
				.limit(2)
				.collect(Collectors.toList());
		
		List<Entry<String, Long>> res2 = res1.entrySet()
				.stream()
				.filter(e -> top2Count.contains(e.getValue()))
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toList());
		
		System.out.println(res1);
		System.out.println(top2Count);
		System.out.println(res2);
		
	}
}
