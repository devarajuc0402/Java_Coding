package Coding.optimize;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Top2WordInSentenceMap {

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
		
		List<Integer> max1 = secondMax(map);
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			
			if(max1.contains(value)) {
				System.out.println(entry);
			}
			
		}
		
		System.out.println(map);
		System.out.println(max1);
	}

	private static List<Integer> secondMax(Map<String, Integer> map) {
	
		int max = Integer.MIN_VALUE;
		int max1 = Integer.MIN_VALUE;
		for(Entry<String, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			
			if(value > max) {
				max1 = max;
				max = value;
			}
			else if(value != max && value > max1) {
				max1 = value;
			}
		}
		return List.of(max, max1);
	}
}
