package streams.optimize;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharOccInStr {

	public static void main(String[] args) {
		
		String s = "programming";
		System.out.println(s);
		
		Map<Character, Long> res = s.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(
						c -> c,
						LinkedHashMap::new,
						Collectors.counting()
				));
		
		System.out.println(res);
	}
}
