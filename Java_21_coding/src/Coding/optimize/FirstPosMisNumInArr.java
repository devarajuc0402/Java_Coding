package Coding.optimize;

import java.util.HashSet;
import java.util.Set;

public class FirstPosMisNumInArr {

	public static void main(String[] args) {
		
//		int[] arr = {3, 4, -1, 1};
//		int[] arr = {1, 2, 0};
		int[] arr = {7, 8, 9, 11, 12};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i : arr) {
			set.add(i);
		}
		
		int miss = 0;
		int current = 1;
		int flag = 0;
//		for(int i : set) {
//			
//			flag = 0;
//			if(i > 0) {
//				if(!set.contains(current)) {
//					miss = current;
//					flag = 1;
//					current++;
//				}
//				current++;
//			}
//			if(flag == 1) {
//				break;
//			}
//		}
//		if(miss == 0)
//			miss = current;
		
		while(set.contains(current)) {
			
			current++;
		}
		
		System.out.println(set);
//		System.out.println(miss);
		System.out.println(current);
	}
}
