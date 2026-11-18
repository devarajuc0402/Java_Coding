package streams.optimize;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestSubStrStream {

	public static void main(String[] args) {
		
//		String s = "abcabcbb";
//		String s = "pwwkew";
		String s = "abcd";
		System.out.println(s);
		
		List<String> res = IntStream.range(0, s.length())
				.boxed()
				.flatMap(i -> 
					IntStream.rangeClosed(i+1, s.length())
						.mapToObj(j -> s.substring(i, j))
						.filter(k -> 
							k.length() == k.chars().distinct().count()
						)
				)
				.collect(Collectors.toList());
		
		System.out.println(res);
				
	}
}
