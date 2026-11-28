package Coding.optimize;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIndicesMap {

	public static void main(String[] args) {
		
		int[] arr = {2, 7, 11, 15};
//		int[] arr = {11, 3, 7, 2, 15};
		int k = 9;
		System.out.println(Arrays.toString(arr));
		System.out.println("k: "+k);
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			int current = arr[i];
			int complement = k - current;
			
			if(map.containsKey(complement)) {
				
				System.out.println(Arrays.toString(
						new int[] {map.get(complement), i}
				));
				return;
			}
			map.put(current, i);
		}
		
		System.out.println(map);
	}
}
