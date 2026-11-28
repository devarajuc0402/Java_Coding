package Coding.optimize;

import java.util.Arrays;

public class TwoSumIndicesLoop {

	public static void main(String[] args) {
		
//		int[] arr = {2, 7, 11, 15};
		int[] arr = {11, 3, 7, 2, 15};
		int k = 9;
		System.out.println(Arrays.toString(arr));
		System.out.println("k: "+k);
		
		int sum = 0;
		int j = 0;
		int x = 0;
		int y = 0;
		for(int i=0;i<arr.length;i++) {
			int value = arr[i];
			if(value <= k) {
				if(sum > k) {
					sum = 0;
					j++;
					i = j;
				}
				else if(sum == k) {
					break;
				}
				x = i;
				y = i+1;
				sum = sum + value;	
			}
		}
		
		
		System.out.println(sum);
		System.out.println("("+x+", "+y+")");
	}
}
