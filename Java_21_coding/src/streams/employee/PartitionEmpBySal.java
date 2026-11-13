package streams.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmpBySal {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Map<Boolean, List<Employee>> res = list.stream()
				.collect(Collectors.partitioningBy(e -> 
						e.salary >= 75000.0
				));
		
		System.out.println(res);
	}
}
