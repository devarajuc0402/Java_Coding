package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsSeqNums {

	public static void main(String[] args) {
		
		int[] arr = new int[] {100, 4, 200, 1, 3, 3, 2, 5, 6};
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = new ArrayList<Integer>();
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			
			int a = arr[i];
			int b = arr[i+1];
			
			if(a != b) {
				if(a+1 == b) {
					list.add(arr[i]);
				} else {
					list.add(arr[i]);
					break;
				}	
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		System.out.println(list.size());
	}
}
