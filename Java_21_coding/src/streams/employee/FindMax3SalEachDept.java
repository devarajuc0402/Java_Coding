package streams.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMax3SalEachDept {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Map<Object, Object> res = list.stream()
				.collect(Collectors.groupingBy(
						e -> e.department,
						Collectors.collectingAndThen(
								Collectors.toList(),
								emp -> emp.stream()
									.sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
									.limit(3)
									.collect(Collectors.toList())
						)
				))
				
				;
		
		System.out.println(res);
	}
}
