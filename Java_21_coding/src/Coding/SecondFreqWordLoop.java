package Coding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecondFreqWordLoop {

	public static void main(String[] args) {
		
		String s = "java spring java microservices spring java angular microservices spring";
//		System.out.println(s);
		String st = s.toLowerCase()
				.replaceAll("[^a-zA-Z0-9\\s]", "")
				.trim();
//		System.out.println(st);
		
		String[] str = st.isEmpty() ? new String[0] : st.split("\\s+");
		System.out.println(Arrays.toString(str));
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		for(int i=0;i<str.length;i++) {
			
			String temp = str[i];
			map.put(temp, map.getOrDefault(temp, 0)+1);
		}
		
		Entry<String, Integer> res = getSecondFreq(map);
		
		System.out.println(map);
		System.out.println(res);
	}

	private static Entry<String, Integer> getSecondFreq(Map<String, Integer> map) {
		
		int first = Integer.MIN_VALUE;
		String firstStr = "";
		int second = Integer.MIN_VALUE;
		String secondStr = "";
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			
			String key = entry.getKey();
			int value = entry.getValue();
			
			if(first < value) {
				second = first;
				secondStr = firstStr;
				first = value;
				firstStr = key;
			}
//			else if(first != value && first > second && second < value) {
			else if(second < value) {
				second = value;
				secondStr = key;
			}
			
		}
		System.out.println(firstStr+"="+first);
		
		return Map.entry(secondStr, second);
	}
}
