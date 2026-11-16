package Coding.optimize;

import java.util.HashSet;
import java.util.Set;

public class LongestConsSeqNums {

	public static void main(String[] args) {
		
//		int[] arr = new int[] {100, 4, 200, 1, 3, 3, 2, 5, 6};
		int[] arr = {1, 2, 3, 10, 11, 20, 21, 22, 23};
		
		Set<Integer> set = new HashSet<Integer>();

		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);	
		}
		System.out.println(set);

		int currentCount = 1;
		int start = set.iterator().next();
		int current = start;

		while (set.contains(current + 1)) {
		    current++;
		    currentCount++;
		}
		
		System.out.println(set);
		System.out.println(currentCount);
	}
}

