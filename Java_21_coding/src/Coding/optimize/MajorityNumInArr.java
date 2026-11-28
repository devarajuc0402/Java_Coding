package Coding.optimize;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityNumInArr {

	public static void main(String[] args) {
		
//		int[] arr = {2, 2, 1, 1, 2, 2, 2};
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		int mid = arr.length/2;
		System.out.println("Majority: "+mid);
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		String res = "No majority element";
		for(int i=0;i<arr.length;i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			if(map.get(arr[i]) > mid) {
				res = String.valueOf(arr[i]);
				break;
			}
		}
		
		System.out.println(map);
		System.out.println(res);
	}
}
