package Coding.optimize;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongNonSubStrInMap {

	public static void main(String[] args) {
		
		String s = "pwwkew";
//		String s = "abc";
		System.out.println(s);
		
		int j = 0;
		int max = 0;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			
			if(map.containsKey(c)) {
				j = map.get(c) + 1;
			}
			
			map.put(c, map.getOrDefault(c, 0)+1);
			
			max = Math.max(max, i-j+1);
		}
		
		System.out.println(map);
		System.out.println(max);
	}
}
