package Coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumAndRepNum {

	public static void main(String[] args) {
		
//		int[] arr = {1, 2, 4, 4, 5};
		int[] arr = {1, 2, 2, 3, 5};
		System.out.println(Arrays.toString(arr));
		
		int num = missingNum(arr);
		
//		int repeated = repeatNum(arr);
		int repeated1 = repeatNum1(arr);
		
		System.out.println(num);
//		System.out.println(repeated);
		System.out.println(repeated1);
	}

	private static int repeatNum1(int[] arr) {
		
		int sum = 0;
		int arrSum = 0;
		for(int i=0;i<arr.length;i++) {
			
			arrSum = arrSum + arr[i];
			sum = sum + i + 1;
		}		
		int index = Math.abs(sum - arrSum - 1);
		
		return arr[index];
	}

	private static int repeatNum(int[] arr) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!set.add(arr[i])) {
				return arr[i];
			}
		}
		
		return 0;
	}

	private static int missingNum(int[] arr) {
		
		if(arr[0] != 1) 
			return 1;
		
		for(int i=0;i<arr.length-1;i++) {
			
			int a = arr[i];
			int b = arr[i+1];
		
			if(a == arr[i+1] || a+1 > b) {
				i++;
			}
			
//			if(a+1 != b) {
//				return arr[i]+1;
//			}
			if (b > a+1) {
	            return arr[i] + 1;
	        }
		}
		return arr[arr.length-1]+1;
	}
}
