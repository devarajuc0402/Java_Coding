package Coding.optimize;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindMaxWordLenInSentenceMap {

	public static void main(String[] args) {
		
		String s = "Java Spring Boot Microservices Architecture";
//		System.out.println();
		String[] str = s.split("\\s+");
		System.out.println(Arrays.toString(str));
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		int max = Integer.MIN_VALUE;
		String maxStr = "";
		for(int i=0;i<str.length;i++) {
			
			String temp = str[i];
			map.put(temp, temp.length());
			
			if(max < temp.length()) {
				max = temp.length();
				maxStr = temp;
			}
		}
		
		System.out.println(map);
		System.out.println(max);
		System.out.println(maxStr);
		
	}
}
