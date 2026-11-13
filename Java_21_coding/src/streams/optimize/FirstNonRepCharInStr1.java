package streams.optimize;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FirstNonRepCharInStr1 {

	public static void main(String[] args) {
		
		String s = "swiss";
		System.out.println(s);
		
		Entry<Character, Long> res = s.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(
						c -> c,
						LinkedHashMap::new,
						Collectors.counting()
				))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.findFirst()
				.orElse(null);
		
		System.out.println(res);
		
	}
}
