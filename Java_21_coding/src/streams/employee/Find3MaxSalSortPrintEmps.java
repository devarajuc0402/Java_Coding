package streams.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Find3MaxSalSortPrintEmps {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		List<Double> top3Sal = list.stream()
				.sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
				.map(e -> e.salary)
				.distinct()
				.limit(3)
				.collect(Collectors.toList());
		
		Map<Double, List<Employee>> res1 = list.stream()
				.filter(e -> top3Sal.contains(e.salary))
				.collect(Collectors.groupingBy(
						e -> e.salary
				));
		
		Map<Object, Object> res2 = list.stream()
				.filter(e -> top3Sal.contains(e.salary))
				.collect(Collectors.groupingBy(
						e -> e.salary,
						Collectors.collectingAndThen(
								Collectors.toList(),
								emp -> emp.stream()
									.sorted(Comparator.comparing(e -> e.name))
									.toList()
						)
				));
		
		System.out.println(top3Sal);
		System.out.println(res1);
		System.out.println(res2);
	}
}
