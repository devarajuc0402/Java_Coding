package Coding.optimize;

import java.util.Arrays;
import java.util.HashSet;

public class ReverseStr {

	public static void main(String[] args) {
		
		String s = "devarajuc";
		
		char[] ch = s.toCharArray();
		
		int j = ch.length-1;
		for(int i=0;i<ch.length && j >= 0;i++) {
			
			char temp = ch[i];
			ch[i] = ch[i+1];
			ch[i+1] = temp;
			j--;
		}
		
		System.out.println(String.join("", new HashSet<String>()));
		System.out.println(String.join("", Arrays.toString(ch)));
	}
}
