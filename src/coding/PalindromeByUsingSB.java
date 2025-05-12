package coding;

public class PalindromeByUsingSB {

	public static boolean isPlindrome(String Str) {

		String reversedStr = new StringBuilder(Str).reverse().toString();

		return Str.equalsIgnoreCase(reversedStr);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		boolean result = isPlindrome("Nayan");

		System.out.println("Is Palindrome: " + result);

	}

}
