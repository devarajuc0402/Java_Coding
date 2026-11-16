package Coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class FirstNonRepeatCharLoop {

	public static void main(String[] args) {
		
		String s = "programming";
		System.out.println(s);
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		Optional<Character> ch = Optional.empty();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			int value = entry.getValue();
			if(value == 1) {
				ch = Optional.of(key);
				break;
			}
		}
		System.out.println(map);
		System.out.println(ch);
	}
	
}
