package Coding;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongNonSubStrInSet {

	public static void main(String[] args) {
		
//		String s = "pwwkew";
		String s = "abc";
		System.out.println(s);
		
		String res = "";
		int max = Integer.MIN_VALUE;
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			
			if(!set.add(c)) {
				
				Iterator<Character> k = set.iterator();
				while(k.hasNext()) {
					
					res = res + k.next();
					k.remove();
				}
				System.out.println(res);
				
				if(max < res.length()) {
					max = res.length();
				}
				res = "";
				i = i-1;
			}
		}
		Iterator<Character> k = set.iterator();
		while(k.hasNext()) {
			res = res + k.next();
		}
		set.clear();
		
		max = Math.max(max, res.length());
		
		System.out.println(set);
		System.out.println(res);
		System.out.println(max);
	}
}
