package Coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairOfSumEqualToKSet {

	public static void main(String[] args) {
		
		int[] arr = {2, 4, 3, 5, 7, 8, 1, 6, 10};
		int k = 9;
		System.out.println(Arrays.toString(arr));
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			int a = arr[i];
			int comp = k - a;
			
			if(set.contains(comp)) {
				System.out.println(comp+", "+arr[i]);
			} 
			else {
				set.add(arr[i]);
			}
		}
		
		System.out.println(set);
		
	}
}
