package Coding.optimize;

import java.util.Arrays;

public class MoveAllZerosAtStartLoop {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 0, 3, 12, 0, 5};
//		int[] arr = {7, 1, 0, 3, 12, 0, 5};
		System.out.println(Arrays.toString(arr));
		
		int j = arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			
			int cur = arr[i];
			
			if(cur != 0) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
