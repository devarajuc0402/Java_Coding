package Coding.optimize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongConsSeqInArr {

	public static void main(String[] args) {
		
//		int[] arr = new int[] {100, 4, 200, 1, 3, 3, 2, 5, 6};
		int[] arr = {1, 2, 3, 10, 11, 20, 21, 22, 23};
//		int[] arr = {100, 4, 200, 1, 3, 2};
		System.out.println(Arrays.toString(arr));
		
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		for(int i : set) {
			
			if(!set.contains(i - 1)) {
				int current = i;
				int count = 1;		
		
				while(set.contains(current + 1)) {
					list.add(current);
					current++;
					count++;
				}
				max = Math.max(max, count);
			}
		}
		
		System.out.println(set);
		System.out.println(max);
		System.out.println(list);
	}
}
