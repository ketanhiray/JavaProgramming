package coding;

public class PalindromeUsingSB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "level";
		String reverseStr = new StringBuilder(str).reverse().toString();

		boolean isPalindrome = str.equalsIgnoreCase(reverseStr);

		System.out.println(isPalindrome);

	}

}
