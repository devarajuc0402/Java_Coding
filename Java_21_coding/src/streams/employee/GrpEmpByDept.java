package streams.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrpEmpByDept {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Map<Object, List<Employee>> res = list.stream()
				.collect(Collectors.groupingBy(e -> e.department));
		
		System.out.println(res);
	}
}
