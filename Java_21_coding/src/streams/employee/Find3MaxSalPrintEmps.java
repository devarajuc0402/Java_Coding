package streams.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Find3MaxSalPrintEmps {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		List<Double> res1 = list.stream()
				.map(d -> d.salary)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.limit(3)
				.collect(Collectors.toList());
		
		Map<Double, List<Employee>> res2 = list.stream()
				.filter(e -> res1.contains(e.salary))
				.collect(Collectors.groupingBy(
						d -> d.salary
				));
		
		System.out.println(res1);
		System.out.println(res2);
	}
}
