package streams.optimize;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class SecondFreqWordStream {

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
		
		Optional<Entry<String, Integer>> res = getSecondFreq(map);
		
		System.out.println(map);
		System.out.println(res);
	}

	private static Optional<Entry<String, Integer>> getSecondFreq(Map<String, Integer> map) {
		
		Optional<Entry<String, Integer>> first = map.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue());
		
		Optional<Entry<String, Integer>> second = map.entrySet()
				.stream()
				.filter(e -> !e.getValue().equals(
						first.map(Entry::getValue).orElse(0)
				))
				.max(Map.Entry.comparingByValue());
		
		System.out.println(first);
		
		return second;
	}
}
