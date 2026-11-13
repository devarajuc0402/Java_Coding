package streams.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondMaxAvgSalDept {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Optional<Entry<String, Double>> res = list.stream()
				.collect(Collectors.groupingBy(
						e -> e.department,
						Collectors.averagingDouble(e -> e.salary)
				))
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.skip(1)
				.findFirst()
				
				;
		
		System.out.println(res);
	}
}
