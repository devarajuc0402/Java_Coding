package streams.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Map<Integer, Employee> res = list.stream()
				.collect(Collectors.toMap(
						e -> e.id,
//						Function.identity(),
						employee -> employee,
						(a, b) -> a.salary >= b.salary ? a : b
				));
		
		System.out.println(res);
	}
}
