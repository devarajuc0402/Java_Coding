package Coding.optimize;

import java.util.Arrays;
import java.util.Optional;

public class FirstNonRepCharInStrArr {

	public static void main(String[] args) {
		
		String s = "swiss";
//		String s = "aabbcc";
		System.out.println(s);
		
		int[] arr = new int[256];
		
		for(int i=0;i<s.length();i++) {
			
			arr[s.charAt(i)]++;
		}
		
		Optional<Character> ch = Optional.empty();
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			if(arr[c] == 1) {
				ch = Optional.of(c);
				break;
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(ch);
	}
}
