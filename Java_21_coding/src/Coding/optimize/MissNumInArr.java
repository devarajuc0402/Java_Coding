package Coding.optimize;

import java.util.Arrays;

public class MissNumInArr {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(arr));
		
		int count = arr[0];
		int res = 0;
		for(int i=1;i<arr.length;i++) {
			
			int j = arr[i];
			count = count+1;
			if(j != count) {
				res = count;
				count++;
				break;
			}
		}
		if(res == 0)
			res = arr[arr.length-1]+1;
		System.out.println(res);
	}
}
