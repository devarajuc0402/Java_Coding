package Coding.optimize;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharOccurTwiceInStr {

	public static void main(String[] args) {
		
		String s = "programmingg";
		System.out.println(s);
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		
		for(Entry<Character, Integer> entry : map.entrySet()) {

			if(entry.getValue() == 2) {
//			if(entry.getValue() > 2) {
				System.out.println(entry.getKey()+"="+entry.getValue());
				break;
			}
		}

		System.out.println(map);
	}
}
