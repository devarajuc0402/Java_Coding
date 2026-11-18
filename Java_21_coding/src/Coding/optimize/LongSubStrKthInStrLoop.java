package Coding.optimize;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongSubStrKthInStrLoop {

	public static void main(String[] args) {
		
		String s = "aabacbebebe";
		int k = 3;
//		String s = "abcba";
//		int k = 2;
		System.out.println(s);
		System.out.println();
		
		int max = 0;
		int j = 0;
		String res = "";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
			
			while(map.size() > k) {
				
				char temp = s.charAt(j);
				map.put(temp, map.getOrDefault(temp, 0) - 1);
				
				if(map.get(temp) == 0) {
					map.remove(temp);
				}
				
				j++;
			}
			
			if(map.size() == k && i-j+1 > max) {
				
				max = i-j+1;
				res = s.substring(j, i+1);
				System.out.println(res);
			}
		}
		
		System.out.println(map);
	}
	
}
