package Coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LongSeqInStrWithoutRepLoop {

	public static void main(String[] args) {
		
//		String s = "aaabbccccddeeeee";
		String s = "aaabbbaa";
//		String s = "a";
//		String s = "aaabbc";
		System.out.println(s);
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		int count = 1;
		for(int i=1;i<s.length();i++) {
			
			char c1 = s.charAt(i);
			char c2 = s.charAt(i-1);
			
			if(c1 == c2) {
				count++;
			}
			else {
				char c = s.charAt(i-1);
				map.put(c, Math.max(map.getOrDefault(c, 0), count));
				count = 1;
			}
			
		}
		if(!s.isEmpty()) {
			char last = s.charAt(s.length()-1);
			map.put(last, Math.max(map.getOrDefault(last, 0), count));
		}

		int max = Integer.MIN_VALUE;
		char ch = '\0';
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			if(max < entry.getValue()) {
				max = entry.getValue();
				ch = entry.getKey();
			}
		}
		
//		for(Entry<Character, Integer> entry : map.entrySet()) {
//			
//			if(max == entry.getValue()) {
//				max = entry.getValue();
//				ch = entry.getKey();
//				System.out.println(ch+"="+max);
//			}
//		}
		
		System.out.println(map);
		System.out.println(ch+"="+max);
	}
}
