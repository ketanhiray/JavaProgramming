package coding;

public class PalindromeString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="level";
		String reverse = new StringBuilder(str).reverse().toString();
		
		boolean isPalindrome= str.equalsIgnoreCase(reverse);
		
		System.out.println(isPalindrome);
		
	}

}
