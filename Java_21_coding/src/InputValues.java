import java.util.Arrays;
import java.util.Scanner;

public class InputValues {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n];
				
		for(int i=0;i<n;i++) {
			arr[i] = sc.next();
		}
		
		System.out.println(n);
		System.out.println(Arrays.toString(arr));
		
		
		sc.close();
	}
}
