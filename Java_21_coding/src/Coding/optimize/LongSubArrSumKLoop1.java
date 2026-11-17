package Coding.optimize;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongSubArrSumKLoop1 {

	public static void main(String[] args) {
		
		int[] arr = {10, 5, 2, 4, 1, 4, 4, 9};
		System.out.println(Arrays.toString(arr));
		int k = 15;
		
		int sum = 0;
		int maxLength = Integer.MIN_VALUE;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		
		for(int i=0;i<arr.length;i++) {
			
			int cur = arr[i];
			sum = sum + cur;
			
			if(map.containsKey(sum - k)) {
				
				int length = i - map.get(sum - k);
				maxLength = Math.max(maxLength, length);
				
				System.out.println(map);
			}
			
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		
		System.out.println(map);
		System.out.println(maxLength);
	}
}
