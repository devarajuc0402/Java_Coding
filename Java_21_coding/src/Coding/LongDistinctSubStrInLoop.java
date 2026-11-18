package Coding;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LongDistinctSubStrInLoop {

	public static void main(String[] args) {
		
		String s = "aabcbcdbca";
		System.out.println(s);
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		int j = 0;
		String res = "";
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		int min = Integer.MAX_VALUE;
		
		for(char c : s.toCharArray()) {
			set.add(c);
		}
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			
			map.put(c, map.getOrDefault(c, 0)+1);
			
			while(map.size() == set.size()) {
				
				if(i - j + 1 < min) {
					min = i - j + 1;
					res = s.substring(j, i+1);
				}
				
				char temp = s.charAt(j);
				
				map.put(temp, map.get(temp) - 1);
				
				if(map.get(temp) == 0) {
					map.remove(temp);
				}
				
				System.out.println(res);
				
				j++;
			}
		}
		
		System.out.println(set);
		System.out.println(res);
	}
}
