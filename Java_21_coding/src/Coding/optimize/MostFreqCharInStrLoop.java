package Coding.optimize;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostFreqCharInStrLoop {

	public static void main(String[] args) {
		
		String s = "programming";
		System.out.println(s);
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			if(max < entry.getValue()) {
				max = entry.getValue();
			}
		}
		
		Map<Character, Integer> res = new HashMap<Character, Integer>();
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			if(max == entry.getValue()) {
				res.put(entry.getKey(), entry.getValue());
			}
		}
		
		System.out.println(map);
		System.out.println(max);
		System.out.println(res);
	}
}
