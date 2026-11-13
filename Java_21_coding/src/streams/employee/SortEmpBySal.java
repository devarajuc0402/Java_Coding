package streams.employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpBySal {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		System.out.println();
		
		List<Employee> res = list.stream()
				.sorted(Comparator.comparing(e -> e.salary))
				.collect(Collectors.toList());
		
		System.out.println(res);
	}
}
