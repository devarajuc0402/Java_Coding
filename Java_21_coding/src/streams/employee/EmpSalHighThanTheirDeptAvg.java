package streams.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpSalHighThanTheirDeptAvg {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Map<String, Double> res1 = list.stream()
				.collect(Collectors.groupingBy(
						e -> e.department,
						Collectors.averagingDouble(e -> e.salary)
				));

		List<Employee> res2 = list.stream()
				.filter(e -> e.salary > res1.get(e.department))
				.collect(Collectors.toList());
		
		System.out.println(res1);
		System.out.println();
		System.out.println(res2);
	}
}
