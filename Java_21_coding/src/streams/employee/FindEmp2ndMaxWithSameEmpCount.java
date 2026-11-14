package streams.employee;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindEmp2ndMaxWithSameEmpCount {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Map<String, Long> deptCount = list.stream()
				.collect(Collectors.groupingBy(
						e -> e.department,
						Collectors.counting()
				))
				;
		
		Optional<Entry<String, Long>> max = deptCount.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue());
		
		boolean rem = deptCount.entrySet()
				.removeIf(e -> e.getValue().equals(max.map(a -> a.getValue()).orElse(0L)));
		
		Map<String, List<Employee>> res2 = list.stream()
				.filter(e -> deptCount.containsKey(e.department))
				.collect(Collectors.groupingBy(
						e -> e.department
				))
				;
		
		Map<Object, Object> ename = res2.entrySet()
				.stream()
				.collect(Collectors.toMap(
						e -> e.getKey(), 
						e -> e.getValue()
							.stream()
							.map(a -> a.name)
							.collect(Collectors.toList())
				));
		
		System.out.println(deptCount);
		System.out.println(max);
		System.out.println(rem);
		System.out.println();
		System.out.println(res2);
		System.out.println();
		System.out.println(ename);
	}
}
