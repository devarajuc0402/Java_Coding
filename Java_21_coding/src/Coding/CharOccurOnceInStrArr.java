package Coding;

import java.util.Arrays;

public class CharOccurOnceInStrArr {

	public static void main(String[] args) {

		String s = "programming";
		System.out.println(s);
		
		int[] arr = new int[256];
		
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]++;
		}
		System.out.println(Arrays.toString(arr));
		
//		for(int i=0;i<s.length();i++) {
		for(int i=s.length()-1;i>=0;i--) {
			if(arr[s.charAt(i)] == 1) {
				System.out.println(s.charAt(i)+"="+arr[s.charAt(i)]);
				break;
			}
		}
		
	}
}
