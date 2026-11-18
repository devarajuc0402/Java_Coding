package Coding.optimize;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongNonSubStrInSet1 {

	public static void main(String[] args) {
		
		String s = "pwwkew";
//		String s = "abc";
		System.out.println(s);
		
		Set<Character> set= new LinkedHashSet<Character>();
		
		int j = 0;
		int max = 0;
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			
			while(set.contains(c)) {
				set.remove(s.charAt(j));
				j++;
			}
			
			set.add(c);
			max = Math.max(max, i-j+1);
		}
		System.out.println(max);
	
	}
}
