package Coding.optimize;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepWordInSenetanceLoop {

	public static void main(String[] args) {
		
//		String s = "java spring java microservices spring angular";
		String s = "java spring java spring";
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
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		System.out.println(map);
	}
}
