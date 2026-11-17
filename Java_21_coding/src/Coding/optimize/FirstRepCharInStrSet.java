package Coding.optimize;

import java.util.HashSet;
import java.util.Set;

public class FirstRepCharInStrSet {

	public static void main(String[] args) {
		
//		String s = "swiss";
		String s = "aabbcc";
		System.out.println(s);
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			if(!set.add(c)) {
				System.out.println(c);
				break;
			}
		}
	}
}
