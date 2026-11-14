package streams.employee;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindEmpByDept2ndMax {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Map<String, Long> res1 = list.stream()
				.collect(Collectors.groupingBy(
						e -> e.department,
						Collectors.counting()
				))
				;
		
		Optional<Entry<String, Long>> max = res1.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue());
		
		boolean rem = res1.entrySet()
				.removeIf(e -> e.getValue().equals(max.map(a-> a.getValue()).orElse(0L)));
		
		Optional<Entry<String, Long>> secondMax = res1.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue());
		
		List<Employee> res2 = list.stream()
				.filter(e -> e.department.equals(secondMax.map(a -> a.getKey()).orElse("")))
				.collect(Collectors.toList())
				;
		
		List<String> res3 = list.stream()
				.filter(e -> e.department.equals(secondMax.map(a -> a.getKey()).orElse("")))
				.map(e -> e.name)
				.collect(Collectors.toList())
				;
		
		System.out.println(res1);
		System.out.println(max);
		System.out.println(rem);
		System.out.println(secondMax);
		System.out.println();
		System.out.println(res2);
		System.out.println(res3);
	}
}
