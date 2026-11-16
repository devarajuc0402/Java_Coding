package Coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class Max2ndRepCharLoop {

	public static void main(String[] args) {
		
//		String s = "aabbbccccddddd";
//		String s = "aaabbbccc";
//		String s = "aaaabb";
		String s = "aaaa";
		System.out.println(s);
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int max = Integer.MIN_VALUE;
		Optional<Character> maxCh = Optional.empty();
		
		int second = Integer.MIN_VALUE;
		Optional<Character> secondCh = Optional.empty();
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			char key = entry.getKey();
			int value = entry.getValue();
			if(value > max) {
				second = max;
				max = value;
				secondCh = maxCh;
				maxCh = Optional.of(key);
			}
			else if(max > value && second < value) {
				second = value;
				secondCh = Optional.of(key);
			}
		}
		System.out.println(map);
		System.out.println(max);
		System.out.println(maxCh);
		
		System.out.println(second);
		System.out.println(secondCh);
	}
}
