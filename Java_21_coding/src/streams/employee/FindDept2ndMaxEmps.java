package streams.employee;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindDept2ndMaxEmps {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Map<Object, Long> res1 = list.stream()
				.collect(Collectors.groupingBy(
						e -> e.department,
						Collectors.counting()
				))
				;
		
		Optional<Entry<Object, Long>> k = res1
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				;
		
		boolean bool = res1.entrySet()
				.removeIf(e -> e.getValue().equals(
						k.map(a -> a.getValue()).orElse(0L)));
		
		Optional<Entry<Object, Long>> res2 = res1.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				;
		
		System.out.println(res1);
		System.out.println(k);
		System.out.println(bool);
		System.out.println(res2);
	}
}
