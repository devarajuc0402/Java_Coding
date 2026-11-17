package Coding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NonRepSequenceCountInStrLoop {

	public static void main(String[] args) {
		
		String s = "abcabcbb";
//		String s = "pwwkew";
//		String s = "abcdef";
		System.out.println(s);
		
		String res = "";
		Set<Character> set = new LinkedHashSet<Character>();
		List<String> list = new ArrayList<String>();
		
		int max = 0;
		String maxStr = "";
		
		for(int i=0;i<s.length();i++) {
			
			res = "";
			char ch = s.charAt(i);
			if(!set.add(ch)) {
				
				Iterator<Character> iterator = set.iterator();
				while(iterator.hasNext()) {
					char temp = iterator.next();
					res = res + temp;
					iterator.remove();
					if(temp == ch) {
						break;
					}
				}
				while(iterator.hasNext()) {
					res = res + iterator.next();
				}
				if(max < res.length()) {
					max = res.length();
					maxStr = res;
				}
				set.add(ch);
				list.add(res);
			}
		}
		if(set.size() == s.length()) {
			max = set.size();
			maxStr = s;
			list.add(maxStr);
		}
		
		System.out.println();
		System.out.println(max);
		System.out.println(maxStr);
//		System.out.println(set);
		System.out.println(list);
	}
}
