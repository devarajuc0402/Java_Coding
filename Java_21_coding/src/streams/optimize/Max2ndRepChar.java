package streams.optimize;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Max2ndRepChar {

	public static void main(String[] args) {
		
//		String s = "aabbbccccddddd";
		String s = "aaabbbccc";
//		String s = "aaaabb";
//		String s = "aaaa";
		System.out.println(s);
		
		Optional<Entry<Character, Long>> res = s.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(
						c -> c,
						LinkedHashMap::new,
						Collectors.counting()
				))
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.skip(1)
				.findFirst()
				;
		
		System.out.println(res);
	}
}
