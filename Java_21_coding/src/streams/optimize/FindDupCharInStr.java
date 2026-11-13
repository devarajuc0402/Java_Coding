package streams.optimize;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FindDupCharInStr {

	public static void main(String[] args) {
		
//		String s = "swiss";
		String s = "programming";
		System.out.println(s);
		
		List<Entry<Character, Long>> res = s.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(
						c -> c,
						LinkedHashMap::new,
						Collectors.counting()
				))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() > 1)
				.collect(Collectors.toList());
		
		System.out.println(res);
		
	}
}
