package Coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LongSeqInStr {

	public static void main(String[] args) {
		
		String s = "aaabbccccddeeeee";
//		String s = "aaabbbaa";
		System.out.println(s);
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		int count = 1;
		for(int i=0;i<s.length()-1;i++) {
		
			count = 1;
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			
			while(i < s.length()-1 && c1 == c2) {
				count++;
				i++;
				if(i < s.length()-1) {
					c1 = s.charAt(i);
					c2 = s.charAt(i+1);	
				}
			}
			if(map.containsKey(c1)) {
				int max = map.get(c1) > count ? map.get(c1) : count;
				map.put(c1, max);
				
			} else {
				map.put(c1, count);	
			}
		}
		
		System.out.println(map);
		
		int max = Integer.MIN_VALUE;
		char ch = '\0';
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				ch = entry.getKey();
			}
		}
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == max) {
				max = entry.getValue();
				ch = entry.getKey();
				System.out.println(ch+"="+max);
			}
		}
		
//		System.out.println(ch+"="+max);

	}
}
