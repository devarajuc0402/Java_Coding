package Coding;

import java.util.Arrays;

public class WordOccInSentanceLoop {

	public static void main(String[] args) {
		
		String s = "java spring java microservices spring java";
//		System.out.println(s);
		String st = s.toLowerCase()
				.replaceAll("[^a-zA-Z0-9\\s]", "")
				.trim();
//		System.out.println(st);
		
		String[] str = st.isEmpty() ? new String[0] : st.split("\\s+");
		
		System.out.println(Arrays.toString(str));
		
		int count = 0;
		for(int i=0;i<str.length;i++) {
			
			count = 1;
			for(int j=i+1;j<str.length;j++) {
				
				if(str[i].equals(str[j])) {
					str[j] = "";
					count++;
				}
			}
			if(!str[i].isEmpty()) {
				System.out.println(str[i]+", "+count);	
			}
			
			str[i] = "";
		}
		
//		System.out.println(Arrays.toString(str));
	}
}
