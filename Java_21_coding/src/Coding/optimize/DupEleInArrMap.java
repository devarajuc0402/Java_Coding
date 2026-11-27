package Coding.optimize;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DupEleInArrMap {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 2, 4, 5, 1, 2, 5};
		System.out.println(Arrays.toString(arr));
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			int j = arr[i];
			map.put(j, map.getOrDefault(j, 0)+1);
		}
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
		}
		
		System.out.println(map);
	}
}
