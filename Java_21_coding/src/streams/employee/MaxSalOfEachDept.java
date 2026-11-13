package streams.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxSalOfEachDept {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Map<Object, Optional<Employee>> res = list.stream()
				.collect(Collectors.groupingBy(
						e -> e.department,
						Collectors.maxBy(Comparator.comparing(
								f -> f.salary
						))
				));
		
		System.out.println(res);
	}
}
