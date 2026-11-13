package streams.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdMaxDisctinctSal {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		Optional<Double> res1 = list.stream()
				.map(s -> s.salary)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(2)
				.findFirst();
		
		Optional<Employee> res2 = list.stream()
				.sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
				.skip(3)
				.findFirst();

		System.out.println(res1);
		System.out.println(res2);
	}
}
