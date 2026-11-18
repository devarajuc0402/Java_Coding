package streams.optimize;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MinFreqCharInStrStream {

	public static void main(String[] args) {
		
		String s = "programming";
		System.out.println(s);
		
		Map<Character, Long> res1 = s.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(
						c -> c,
						LinkedHashMap::new,
						Collectors.counting()
				));
		
		Long min = res1.entrySet()
				.stream()
				.min(Map.Entry.comparingByValue())
				.get()
				.getValue();
		
		List<Entry<Character, Long>> res2 = res1.entrySet()
				.stream()
				.filter(e -> e.getValue().equals(min))
				.collect(Collectors.toList());
		
		System.out.println(res1);
		System.out.println(min);
		System.out.println(res2);
	}
}
