package Coding;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccInStrLoop {

	public static void main(String[] args) {
		
		String s = "programming";
		System.out.println(s);
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
	}
}
