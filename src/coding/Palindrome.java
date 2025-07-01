package coding;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "level";

		String reverse = new StringBuilder(str).reverse().toString();

		boolean isPalindrone = str.equalsIgnoreCase(reverse);

		System.out.println(isPalindrone);

	}

}
