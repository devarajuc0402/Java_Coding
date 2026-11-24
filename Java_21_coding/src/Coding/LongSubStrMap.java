package Coding;

import java.util.HashMap;
import java.util.Map;

public class LongSubStrMap {

	public static void main(String[] args) {
		
//		String s = "pwwkew";
//		String s = "abcabcbb";
//		String s = "bbbbb";
//		String s = "dvdf";
		String s = "devarajuc";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		String res = "";
		int left = 0;
		
		for(int right=0;right<s.length();right++) {
			
			char c = s.charAt(right);
			
			boolean a = map.containsKey(c);
			Integer b = map.get(c);
			
			if(map.containsKey(c) && map.get(c) >= left) {
				
				left = map.get(c) + 1;

			}
			map.put(c, right);
			
			if(max < right - left + 1) {
				max = right - left + 1;
				res = s.substring(left, right+1);
				System.out.println(res);
			}
		}
		
		System.out.println(res);
		System.out.println(max);
		System.out.println(map);
	}
}
