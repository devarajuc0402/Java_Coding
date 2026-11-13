package streams.employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTop3MaxSalEmp {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		List<Employee> res = list.stream()
				.sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
				.limit(3)
				.collect(Collectors.toList());
		
		System.out.println(res);
				
	}
}
