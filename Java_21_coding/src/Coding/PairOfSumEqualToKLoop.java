package Coding;

import java.util.Arrays;

public class PairOfSumEqualToKLoop {

	public static void main(String[] args) {
		
		int[] arr = {2, 4, 3, 5, 7, 8, 1, 6, 10};
		int k = 9;
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		int sum = 0;
		int j = arr.length-1;
		int i = 0;
		while(i < arr.length/2 && j >= 0) {
			
			int a = arr[i];
			int b = arr[j];
			
			sum = a + b;
			if(sum == k) {
				System.out.println(arr[i]+", "+arr[j]);
				i++;
				j--;
			}
			else if(sum < k) {
				i++;
			}
			else if(sum > k) {
				j--;	
			}
			
		}
		
//		System.out.println(list);
		System.out.println(Arrays.toString(arr));
	}
}
