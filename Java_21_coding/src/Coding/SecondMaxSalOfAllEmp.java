package Coding;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import streams.employee.Employee;

public class SecondMaxSalOfAllEmp {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Optional<Employee> res1 = list.stream()
				.collect(Collectors.maxBy(Comparator.comparing(
						e -> e.salary
				)))
				;
		
		List<Employee> res2 = list.stream()
				.filter(e -> e.salary != res1.map(a -> a.salary).orElse(0.0))
				.sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
				.collect(Collectors.toList());
		
		Optional<Employee> max = res2.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble((Employee e) -> e.salary)));
				
		List<Employee> res3 = res2.stream()
				.filter(e -> e.salary == max.get().salary)
				.collect(Collectors.toList());
		
		Map<String, List<Double>> res4 = res2.stream()
				.filter(e -> e.salary == max.map(a -> a.salary).orElse(0.0))
				.collect(Collectors.groupingBy(
						e -> e.name,
						Collectors.collectingAndThen(
								Collectors.toList(),
								emp -> emp.stream()
									.map(e -> e.salary)
									.collect(Collectors.toList())
						)
				));
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(max);
		System.out.println(res3);
		System.out.println(res4);
	}
}
