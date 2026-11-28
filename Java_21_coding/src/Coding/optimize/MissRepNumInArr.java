package Coding.optimize;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissRepNumInArr {

	public static void main(String[] args) {
		
		int[] arr = {2, 1, 4, 4, 5};
		System.out.println(Arrays.toString(arr));
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int miss = 0;
		int rep = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for(int i=1;i<=arr.length-1;i++) {
			
			int count = map.getOrDefault(i, 0);
			
			if(count == 0) {
				miss = i;
			}
			if(count > 1) {
				rep = i;
			}
		}
		
		System.out.println(map);
		System.out.println("miss: "+miss);
		System.out.println("rep: "+rep);
	}
}
