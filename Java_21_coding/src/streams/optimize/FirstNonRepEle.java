package streams.optimize;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class FirstNonRepEle {

	public static void main(String[] args) {
		
		int[] arr = {10, 5, 3, 4, 3, 5, 6};
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		Set<Integer> set = new HashSet<Integer>();
		
		Optional<Integer> res = list.stream()
				.filter(i -> !set.add(i))
				.findFirst();
		
		System.out.println(res);
	}
}
