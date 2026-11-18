package Coding;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongSubStrInStrLoop {

	public static void main(String[] args) {
		
//		String s = "abcabcbb";
		String s = "abacdefa";
//		String s = "abcd";
//		String s = "a";
//		String s = "aa";
		System.out.println(s);
		
		Set<String> list = new LinkedHashSet<String>();
		Set<Character> set = new LinkedHashSet<Character>();
		String res = "";
		int j = 0;
		
		int max = Integer.MIN_VALUE;
		String maxStr = "";
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			if(!set.add(c)) {
				
				j++;
				i = j-1;
				
				Iterator<Character> iterator = set.iterator();
				while(iterator.hasNext()) {
					
					res = res + iterator.next();
					iterator.remove();
				}
				if(max < res.length()) {
					max = res.length();
					maxStr = res;
				}
				list.add(res);
				res = "";
			} 
		}
		if(!set.isEmpty()) {
			Iterator<Character> iterator = set.iterator();
			while(iterator.hasNext()) {
				
				res = res + iterator.next();
				iterator.remove();
			}
			list.add(res);
		}
		
		System.out.println(list);
		System.out.println(maxStr+"="+max);
	}
}
