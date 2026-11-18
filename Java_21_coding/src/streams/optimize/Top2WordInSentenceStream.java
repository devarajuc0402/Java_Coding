package streams.optimize;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Top2WordInSentenceStream {

	public static void main(String[] args) {
		
		String s = "java spring java microservices spring java angular microservices spring";
//		System.out.println(s);
		String st = s.toLowerCase()
				.replaceAll("[^a-zA-Z0-9\\s]", "")
				.trim();
//		System.out.println(st);
		
		String[] str = st.isEmpty() ? new String[0] : st.split("\\s+");
		System.out.println(Arrays.toString(str));
		
		Map<String, Long> res1 = Arrays.stream(str)
				.collect(Collectors.groupingBy(
						ss -> ss,
						LinkedHashMap::new,
						Collectors.counting()
				));
		
		Optional<Long> max = res1.entrySet()
				.stream()
				.map(e -> e.getValue())
				.max(Long::compareTo);
		
		Optional<Long> secondMax = res1.entrySet()
				.stream()
				.map(e -> e.getValue())
				.filter(a -> !a.equals(max.map(e -> e).orElse(0L)))
				.max(Long::compareTo);
		
		List<Entry<String, Long>> res2 = res1.entrySet()
				.stream()
				.filter(a -> 
					a.getValue().equals(max.map(e -> e).orElse(0L)) ||
					a.getValue().equals(secondMax.map(e -> e).orElse(0L))
				)
				.collect(Collectors.toList());
		
		System.out.println(res1);
		System.out.println(max);
		System.out.println(secondMax);
		System.out.println(res2);
	}
}
