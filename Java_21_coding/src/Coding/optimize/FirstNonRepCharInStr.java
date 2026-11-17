package Coding.optimize;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class FirstNonRepCharInStr {

	public static void main(String[] args) {
		
//		String s = "swiss";
		String s = "aabbcc";
		System.out.println(s);
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		Optional<Character> charOcc = charOccurance(map);
		
		System.out.println(map);
		System.out.println(charOcc);
	}

	private static Optional<Character> charOccurance(Map<Character, Integer> map) {
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == 1) {
				return Optional.of(entry.getKey());
			}
		}
		
		return Optional.empty();
	}
}
