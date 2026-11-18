package Coding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LongPolidSubStrLoop {

	public static void main(String[] args) {
		
//		String s = "babadd";
		String s = "abba";
		System.out.println(s);
		
//		boolean b = checkPolidrome("bab");
//		System.out.println(b);
		
		Set<Character> set = new LinkedHashSet<Character>();
		List<String> list = new ArrayList<String>();
		
		String res = "";
		int j=0;
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			if(!set.add(c)) {
				
				Iterator<Character> iterator = set.iterator();
				while(iterator.hasNext()) {
					res = res + iterator.next();
					iterator.remove();
				}
				res = res + c;
				boolean b = checkPolidrome(res);
				if(b) {
					list.add(res);
				}
				
				res = "";
				j++;
				i = j-1;
			}
		}
		System.out.println(set);
		System.out.println(list);
	}

	private static boolean checkPolidrome(String s) {
		
		for(int i=0, j=s.length()-1;i<s.length()/2;i++, j--) {
			
			char c1 = s.charAt(i);
			char c2 = s.charAt(j);
			if(c1 != c2) {
				return false;
			}
		}
		return true;
	}
}
