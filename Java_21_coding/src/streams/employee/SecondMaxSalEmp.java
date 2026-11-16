package streams.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondMaxSalEmp {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		List<Double> res = list.stream()
				.map(e -> e.salary)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		Optional<Double> max = list.stream()
				.map(e -> e.salary)
				.max(Double::compareTo);
		
		Optional<Double> secondMax = max.flatMap(e -> 
					list.stream()
						.map(s -> s.salary)
						.filter(salary -> salary < e)
						.max(Double::compareTo)
				);
		
		System.out.println(res);
		System.out.println(max);
		System.out.println(secondMax);
	}
}
