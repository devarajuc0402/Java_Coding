package streams.employee;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeptWithHighAvgSal {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Optional<Entry<String, Double>> res = list.stream()
				.collect(Collectors.groupingBy(
						e -> e.department,
						Collectors.averagingDouble(a -> a.salary)
				))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				
				;
		
		System.out.println(res);
	}
}
