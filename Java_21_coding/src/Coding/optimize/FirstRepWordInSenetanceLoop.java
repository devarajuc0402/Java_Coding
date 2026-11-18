package Coding.optimize;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstRepWordInSenetanceLoop {

	public static void main(String[] args) {
		
		String s = "java spring angular java microservices spring";
//		String s = "java spring java spring";
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
		
		String res = checkString(map);
		
		System.out.println(map);
		System.out.println(res);
	}

	private static String checkString(Map<String, Integer> map) {
		for(Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				return entry.getKey();
			}
		}
		return "Not Found";
	}
}
