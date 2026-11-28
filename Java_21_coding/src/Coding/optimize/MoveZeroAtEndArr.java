package Coding.optimize;

import java.util.Arrays;

public class MoveZeroAtEndArr {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 0, 3, 12};
		System.out.println(Arrays.toString(arr));
		
		int j = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] != 0) {
			
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
