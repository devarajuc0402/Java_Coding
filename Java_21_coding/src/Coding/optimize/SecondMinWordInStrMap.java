package Coding.optimize;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecondMinWordInStrMap {

	public static void main(String[] args) {
		
		String s = "aaabbbbccddeeffffg";
		System.out.println(s);
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for(int i=0;i<s.length();i++) {

			char temp = s.charAt(i);
			map.put(temp, map.getOrDefault(temp, 0)+1);
		}
		System.out.println(map);
		
		int first = Integer.MAX_VALUE;
		char firstStr = '\0';
		int second = Integer.MAX_VALUE;
		char secondStr = '\0';
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			char key = entry.getKey();
			int value = entry.getValue();
			if(first != second && value < second) {
				first = second;
				firstStr = secondStr;
				second = value;
				secondStr = key;
			}
			else if(value < first) {
				first = value;
				firstStr = key;
			}
		}
		
		System.out.println(firstStr+"="+first);
		System.out.println(secondStr+"="+second);
	}
}
