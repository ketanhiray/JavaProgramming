package coding;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "level";
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		System.out.println(str.equalsIgnoreCase(reverse));
		
	}

}
