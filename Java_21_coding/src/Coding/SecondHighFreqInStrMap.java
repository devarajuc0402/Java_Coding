package Coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecondHighFreqInStrMap {

	public static void main(String[] args) {
		
		String s = "programming";
		System.out.println(s);
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for(int i=0;i<s.length();i++) {

			char temp = s.charAt(i);
			map.put(temp, map.getOrDefault(temp, 0)+1);
		}
		
		int first = Integer.MIN_VALUE;
		char firstStr = '\0';
		int second = Integer.MIN_VALUE;
		char secondStr = '\0';
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			char key = entry.getKey();
			int value = entry.getValue();
			if(value > first) {
				second = first;
				secondStr = firstStr;
				first = value;
				firstStr = key;
			}
			else if(first != second && value < second) {
				second = value;
				secondStr = key;
			}
		}
		
		System.out.println(map);
		System.out.println(firstStr+"="+first);
		System.out.println(secondStr+"="+second);
	}
}
