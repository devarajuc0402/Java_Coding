package streams.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEmpWithSameSal {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Map<Double, Object> res1 = list.stream()
				.collect(Collectors.groupingBy(
						e -> e.salary
				))
				.entrySet()
				.stream()
				.filter(e -> e.getValue().stream().count() > 1)
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						e -> e.getValue().stream()
							.map(q -> q.name)
							.collect(Collectors.toList())
						
				))
								
				;
		
		System.out.println(res1);
		System.out.println();
//		System.out.println(res2);
	}
}
