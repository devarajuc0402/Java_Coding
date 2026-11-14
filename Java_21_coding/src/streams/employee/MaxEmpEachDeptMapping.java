package streams.employee;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxEmpEachDeptMapping {

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
		
		List<String> maxObj = res1.entrySet()
				.stream()
				.filter(e -> e.getValue().equals(max.get().getValue()))
				.map(e -> e.getKey())
				.collect(Collectors.toList());
		
		System.out.println(maxObj.contains("HR"));
		
		Map<String, List<Employee>> res2 = list.stream()
				.filter(e -> maxObj.contains(e.department))
				.collect(Collectors.groupingBy(
						e -> e.department
				))
				;
		
		Map<String, List<String>> res3 = list.stream()
				.filter(e -> maxObj.contains(e.department))
				.collect(Collectors.groupingBy(
						e -> e.department,
						Collectors.mapping(
								a -> a.name,
								Collectors.toList()
						)
				))
				;
		
		Map<String, List<String>> res4 = list.stream()
				.filter(e -> maxObj.contains(e.department))
				.collect(Collectors.groupingBy(
						e -> e.department,
						Collectors.collectingAndThen(
								Collectors.toList(),
								emp -> emp.stream()
									.map(a -> a.name)
									.collect(Collectors.toList())
						)
				))
				;
		
		System.out.println(res1);
		System.out.println(max);
		System.out.println(maxObj);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}
}
