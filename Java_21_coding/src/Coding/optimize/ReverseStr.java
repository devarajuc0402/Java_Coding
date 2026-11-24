package Coding.optimize;

public class ReverseStr {

	public static void main(String[] args) {
		
		String s = "devarajuc";
		
		char[] ch = s.toCharArray();
		
		int j = ch.length-1;
		for(int i=0;i<(ch.length-1)/2;i++) {
			
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			j--;
		}
		
		String res = String.valueOf(ch);
		System.out.println(res);
	}
}
