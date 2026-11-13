package streams.optimize;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxOccInString {

	public static void main(String[] args) {
		
		String s = "successfully";
		System.out.println(s);
		
		Optional<Entry<Character, Long>> res1 = s.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(
						c -> c,
						LinkedHashMap::new,
						Collectors.counting()
				))
				.entrySet()
				.stream()
//				.reduce((a, b) -> a.getValue() > b.getValue() ? a : b);
				
				.max(Map.Entry.comparingByValue());
		
		System.out.println(res1);
	}
}
