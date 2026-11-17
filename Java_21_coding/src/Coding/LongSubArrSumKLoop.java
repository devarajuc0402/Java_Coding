package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongSubArrSumKLoop {

	public static void main(String[] args) {
		
		int[] arr = {10, 5, 2, 7, 1, 9};
		System.out.println(Arrays.toString(arr));
		int k = 15;
		int j = 0;
		
		List<Integer> ll = new ArrayList<Integer>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		int res = 0;
		for(int i=0;i<arr.length;i++) {
			
			int temp = arr[i];
			res = res + temp;
			ll.add(temp);
			
			if(res == k) {
				list.add(ll);
				ll = new ArrayList<Integer>();
				res = 0;
				i = j;
				j++;
			}
		}
		int max = Integer.MIN_VALUE;
		List<Integer> maxList = new ArrayList<Integer>();
		
		for(int i=0;i<list.size();i++) {
			int size = list.get(i).size();
			if(size > max) {
				max = i;
			}
		}
		maxList = list.get(max);
		
		
		System.out.println(ll);
		System.out.println(list);
		System.out.println(maxList);
	}
}
