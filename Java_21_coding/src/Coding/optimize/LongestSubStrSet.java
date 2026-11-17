package Coding.optimize;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LongestSubStrSet {

	public static void main(String[] args) {
		
		String s = "abcadbcbb";
//		String s = "pwwkew";
//		String s = "abcd";
		System.out.println(s);
		
		Set<Character> set = new LinkedHashSet<Character>();
		List<String> list = new ArrayList<String>();
		String res = "";
		
		int j = 0;
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			
			if(!set.add(c)) {
				
				Iterator<Character> iterator = set.iterator();
//				if(iterator.hasNext()) {
//					res = res + iterator.next();
//					iterator.remove();
//				}
				while(iterator.hasNext()) {
					res = res + iterator.next();
					iterator.remove();
				}
				list.add(res);
				res = "";
				
				j++;
				i = j-1;
			}
		}
		if(set.size() == s.length()) {
			list.add(s);
		}
		
		System.out.println(set);
		System.out.println(list);
	}
}
