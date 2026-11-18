package Coding.optimize;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MinFreqCharInStrLoop {

	public static void main(String[] args) {
	
		String s = "programming";
		System.out.println(s);
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		
		int min = Integer.MAX_VALUE;
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() < min) {
				min = entry.getValue();
			}
		}
		
		System.out.println(min);
		for(Entry<Character, Integer> entry : map.entrySet()) {

			if(entry.getValue() == min) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
		}
	}
	
	
}
