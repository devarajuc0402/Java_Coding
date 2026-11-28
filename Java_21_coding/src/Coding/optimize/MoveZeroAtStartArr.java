package Coding.optimize;

import java.util.Arrays;

public class MoveZeroAtStartArr {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 0, 3, 12};
		System.out.println(Arrays.toString(arr));
		
		int j = arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			
			if(arr[i] != 0) {
			
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
