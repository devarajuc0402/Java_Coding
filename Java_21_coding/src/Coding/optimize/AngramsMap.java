package Coding.optimize;

import java.util.Arrays;

public class AngramsMap {

	public static void main(String[] args) {
		
		String s1 = "silent";
		String s2 = "listen";
		
		boolean compare = isAnagram(s1, s2);
		System.out.println(compare);
	}

	private static boolean isAnagram(String s1, String s2) {
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if(s1.length() != s2.length()) {
			return false;
		}
		
		int[] arr = new int[26];
		
		for(int i=0;i<s1.length();i++) {
			arr[s1.charAt(i) - 'a']++;
			arr[s2.charAt(i) - 'a']--;
		}
		
		for(int n : arr) {
			if(n != 0) {
				return false;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		return true;
	}

//	private static boolean isAnagram(String s1, String s2) {
//		
//		if(s1.length() != s2.length()) {
//			return false;
//		} 
//		else {
//			char[] c1 = s1.toCharArray();
//			char[] c2 = s2.toCharArray();
//			
//			Arrays.sort(c1);
//			Arrays.sort(c2);
//			
//			return Arrays.equals(c1, c2);	
//		}
//	}
}
