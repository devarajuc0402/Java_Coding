package Coding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaxFreqWordInSentanceLoop {

	public static void main(String[] args) {
		
		String s = "Java is great. Java is powerful, and Java is popular!";
		System.out.println(s);
		String st = s.toLowerCase().trim()
				.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(st);
		
		Map<String, Long> map = new LinkedHashMap<String, Long>();
		
		String[] str = st.isEmpty() ? new String[0] : st.split("\\s+");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++) {
			String temp = str[i];
			map.put(temp, map.getOrDefault(temp, 0L)+1);
		}
		String maxString = "";
		long max = Long.MIN_VALUE;
		
		for(Entry<String, Long> entry : map.entrySet()) {
			String key = entry.getKey();
			long value = entry.getValue();
			if(max < value) {
				max = value;
				maxString = key;
			}
		}
		Map<String, Long> res = new LinkedHashMap<String, Long>();
		for(Entry<String, Long> entry : map.entrySet()) {
			if(entry.getValue() == max) {
				res.put(entry.getKey(), entry.getValue());
			}
		}
		
		System.out.println(map);
		System.out.println(maxString+": "+max);
		System.out.println(res);
	}
}
