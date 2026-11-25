package Coding.optimize;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepCharInStrMap {

	public static void main(String[] args) {
		
		String s = "swiss";
		System.out.println(s);
		
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			map1.put(c, map1.getOrDefault(c, 0)+1);
		}
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(map1.get(c) == 1) {
				System.out.println(c+"=1");
				break;		
			}
		}
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(map1.get(c) > 1) {
				System.out.println(c+"="+map1.get(c));
				break;		
			}
		}
		
		System.out.println(map1);
		
	}
}
