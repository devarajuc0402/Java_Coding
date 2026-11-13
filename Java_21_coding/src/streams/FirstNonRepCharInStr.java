package streams;

public class FirstNonRepCharInStr {

	public static void main(String[] args) {
		
//		String s ="swiss";
		String s = "aabbcc";
		System.out.println(s);
		
		Character res = s.chars()
				.mapToObj(c -> (char)c)
				.distinct()
				.filter(i -> s.indexOf(i) == s.lastIndexOf(i))
				.findFirst()
				.orElse(null);
		
		System.out.println(res);
		
	}
}
