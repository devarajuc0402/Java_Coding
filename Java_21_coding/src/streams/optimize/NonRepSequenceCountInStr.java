package streams.optimize;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NonRepSequenceCountInStr {

	public static void main(String[] args) {
		
		String s = "abcabcbb";
//		String s = "pwwkew";
//		String s = "abcdef";
		System.out.println(s);
		
		List<String> res1 = IntStream.range(0, s.length())
				.boxed()
				.flatMap(i -> 
					IntStream.rangeClosed(i+1, s.length())
						.mapToObj(j -> s.substring(i, j))
						.filter(k -> 
							k.length() == k.chars().distinct().count()
						)
				)
				.collect(Collectors.toList());
		
		Optional<String> res2 = IntStream.range(0, s.length())
				.boxed()
				.flatMap(i ->
					IntStream.range(i+1, s.length()+1)
						.mapToObj(j -> s.substring(i, j))
						.filter(k -> 
							k.chars().distinct().count() == k.length()
						)
				)
				.max(Comparator.comparingInt(String::length));
						
		
		
		System.out.println(res1);
		System.out.println(res2);

	}
}
