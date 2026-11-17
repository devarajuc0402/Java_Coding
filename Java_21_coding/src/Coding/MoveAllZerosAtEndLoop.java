package Coding;

import java.util.Arrays;

public class MoveAllZerosAtEndLoop {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 0, 3, 12, 0, 5};
//		int[] arr = {7, 1, 0, 3, 12, 0, 5};
		System.out.println(Arrays.toString(arr));
		
		int j = 0;
		for(int i=0;i<arr.length;i++) {
			
			int cur = arr[i];
			
			if(cur != 0) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
