package streams.employee;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxDeptBaseEmpSamePrintAllDept {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
//		List<Entry<String, Long>> res1 = list.stream()
//				.collect(Collectors.groupingBy(
//						e -> e.department,
//						Collectors.counting()
//				))
//				.entrySet()
//				.stream()
//				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//				.collect(Collectors.toList())
//				;
//		
//		Long k = res1.get(0).getValue();
//		
//		List<Entry<String, Long>> res2 = res1.stream()
//				.filter(i -> i.getValue() == k)
//				.collect(Collectors.toList());
		
		Map<Object, Long> res1 = list.stream()
				.collect(Collectors.groupingBy(
						e -> e.department,
						Collectors.counting()
				));
		
		Optional<Entry<Object, Long>> k = res1.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue());
		
		List<Entry<Object, Long>> res2 = res1.entrySet()
				.stream()
				.filter(i -> i.getValue().equals(k.get().getValue()))
				.collect(Collectors.toList());
		
		System.out.println(res1);
		System.out.println(k.get());
		System.out.println(res2);
	}
}
