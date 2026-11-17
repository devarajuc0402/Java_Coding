package Coding;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DupEleInArr {

	public static void main(String[] args) {
		
		int[] arr = {4, 3, 2, 7, 8, 2, 3, 1, 4, 4};
		System.out.println(Arrays.toString(arr));
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		Set<Integer> res = new LinkedHashSet<Integer>();

		for(int i=0;i<arr.length;i++) {
			
			if(!set.add(arr[i])) {
				
				res.add(arr[i]);
			}
		}
		
		System.out.println(set);
		System.out.println(res);
		
		
	}
}
