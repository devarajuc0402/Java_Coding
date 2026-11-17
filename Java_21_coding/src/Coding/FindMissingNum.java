package Coding;

import java.util.Arrays;

public class FindMissingNum {

	public static void main(String[] args) {
		
//		int[] arr = {1, 2, 4, 5, 6};
//		int[] arr = {1, 2, 3, 5};
//		int[] arr = {2, 3, 4, 5};
		int[] arr = {1, 2, 3, 4};
		System.out.println(Arrays.toString(arr));
			
		int res = checkNum(arr);
		System.out.println(res);
	}

	private static int checkNum(int[] arr) {
		
		if(arr[0] != 1) {
			return 1;
		}
		
		for(int i=0;i<arr.length-1;i++) {
			
			int a = arr[i];
			int b = arr[i+1];
			
			if(a+1 > b) {
				i++;
			}
			else if(a+1 != b) {
				return arr[i]+1;
			}
			if(i == arr.length-2) {
				return arr[arr.length-1]+1;
			}
		}
		return 0;
	}
}
