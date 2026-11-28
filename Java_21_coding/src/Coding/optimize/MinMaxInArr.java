package Coding.optimize;

import java.util.Arrays;

public class MinMaxInArr {

	public static void main(String[] args) {
		
		int[] arr = {12, 5, 8, 25, 3, 18};
		System.out.println(Arrays.toString(arr));
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			if(min > temp) {
				min = temp;
			}
			if(max < temp) {
				max = temp;
			}
		}
		
		System.out.println(min);
		System.out.println(max);
	}
}
