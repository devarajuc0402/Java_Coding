package Coding.optimize;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstNonRepEle {

	public static void main(String[] args) {
		
		int[] arr = {10, 5, 3, 4, 3, 5, 6};
		System.out.println(Arrays.toString(arr));
		
		boolean b = isRepeated(arr);
		
		System.out.println(b);
	}

	private static boolean isRepeated(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!set.add(arr[i])) {
				System.out.println(arr[i]);
				return true;
			}
		}
		return false;
	}
}
