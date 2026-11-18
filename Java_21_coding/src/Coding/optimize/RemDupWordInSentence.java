package Coding.optimize;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemDupWordInSentence {

	public static void main(String[] args) {
		
		String s = "java spring java microservices spring angular";
//		System.out.println(s);
		String st = s.toLowerCase()
				.replaceAll("[^a-zA-Z0-9\\s]", "")
				.trim();
//		System.out.println(st);
		
		String[] str = st.isEmpty() ? new String[0] : st.split("\\s+");
		System.out.println(Arrays.toString(str));
		
		Set<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		
		System.out.println(set);
		
		String res = String.join(" ", set);
		System.out.println(res);
	}
}
