package Coding.optimize;

import java.util.stream.IntStream;

public class Polidrome {

	public static void main(String[] args) {
		
		String s1 = "MAdam";
//		String s1 = "Devarajuc";
		
		String s = s1.toLowerCase();
		System.out.println(s);
		
//		boolean res = IntStream.rangeClosed(0, s.length()/2)
//				.allMatch(i -> s.charAt(i) == s.charAt(s.length() -1 - i));
//		
//		System.out.println(res);
		
		int left = 0;
		int right = s.length()-1;
		
		boolean b= checkPolidrome(s);
		
		System.out.println(b);
				
	}

	private static boolean checkPolidrome(String s1) {
		
		String s = s1.toLowerCase();
		int left = 0;
		int right = s.length()-1;
		
		while(left < right) {
			
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		return true;
	}


}
