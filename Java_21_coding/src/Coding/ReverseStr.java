package Coding;

import java.util.Arrays;

public class ReverseStr {

	public static void main(String[] args) {
		
		String s = "Hello Java Programming";
		System.out.println(s);
		
		char[] ch = s.toCharArray();
		
		for(int i=0,j=ch.length-1;i<ch.length/2 && j>=0; i++, j--) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(new String(ch));
		
	}
}
