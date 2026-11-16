package Coding;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class NonRepeatCharInStr {

	public static void main(String[] args) {
		
		String s = "swiss";
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
				.filter(e -> e.getValue().equals(1L))
				.findFirst()
				;
		
		System.out.println(res);
	}
}
