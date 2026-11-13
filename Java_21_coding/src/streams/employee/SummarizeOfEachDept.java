package streams.employee;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummarizeOfEachDept {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Map<String, DoubleSummaryStatistics> res = list.stream()
				.collect(Collectors.groupingBy(
						e -> e.department,
						Collectors.summarizingDouble(
								e -> e.salary
						)
				))
				
				;
		
		System.out.println(res);
	}
}
