package coding;

public class CheckPalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "level";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse += str.charAt(i);

		}
		System.out.println(reverse);
		boolean isPalindrome = str.equalsIgnoreCase(reverse);
		
		System.out.println("Is Palindrome: "+isPalindrome);

	}

}
