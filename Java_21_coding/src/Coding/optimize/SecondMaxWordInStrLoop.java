package Coding.optimize;

import java.util.Arrays;

public class SecondMaxWordInStrLoop {

	public static void main(String[] args) {
		
		String s = "Java Spring Boot Microservices Architecture";
//		System.out.println(s);
		String st = s.toLowerCase()
				.replaceAll("[^a-zA-Z0-9\\s]", "")
				.trim();
		
		String[] str = st.isEmpty() ? new String[0] : st.split("\\s+");
		System.out.println(Arrays.toString(str));
		
		int first = Integer.MIN_VALUE;
		String firstStr = "";
		int second = Integer.MIN_VALUE;
		String secondStr = "";
		
		for(int i=0;i<str.length;i++) {
			
			if(str[i].length() > first) {
				second = first;
				secondStr = firstStr;
				first = str[i].length();
				firstStr = str[i];
			}
			else if(first > second && second < str[i].length()) {
				second = str[i].length();
				secondStr = str[i];
			}
		}
		
		System.out.println(first);
		System.out.println(firstStr);
		System.out.println(second);
		System.out.println(secondStr);
	}
}
