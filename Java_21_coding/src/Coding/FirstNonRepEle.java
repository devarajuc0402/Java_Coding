package Coding;

import java.util.Arrays;

public class FirstNonRepEle {

	public static void main(String[] args) {
		
		int[] arr = {10, 5, 3, 4, 3, 5, 6};
		System.out.println(Arrays.toString(arr));

		int res = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				int a = arr[i];
				int b = arr[j];
				if(a == b) {
					res = arr[i];
					break;
				}
			}
			if(res != 0) {
				break;
			}
		}

		System.out.println(res);
	}
}
