package Coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostFreqCharInStrArr {

	public static void main(String[] args) {
		
		String s = "programming";
		System.out.println(s);
		
		int max = Integer.MIN_VALUE;
		
		int[] arr = new int[256];
		
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]++;
		}
		
		for(int i=0;i<s.length();i++) {
			
			if(arr[s.charAt(i)] > max) {
				max = arr[s.charAt(i)];
			}
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			
			if(arr[s.charAt(i)] == max) {
				map.put(s.charAt(i), max);
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(map);
	}
}
