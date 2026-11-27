package Coding.optimize;

import java.util.Arrays;

public class SecondMaxEleArr {

	public static void main(String[] args) {
		
//		int[] arr = {10, 5, 20, 8, 20, 15};
		int[] arr = {10, 30, 20, 50, 40};
		
		System.out.println(Arrays.toString(arr));
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			int temp = arr[i];
			if(max < temp) {
				secondMax = max;
				max = temp;
			}
			else if(max != temp && secondMax < max && secondMax < temp) {
				secondMax = temp;
			}
		}
		
		System.out.println(max);
		System.out.println(secondMax);
	}
}
