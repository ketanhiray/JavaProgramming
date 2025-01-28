package coding;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Nayan";

		boolean flag = true;

		str = str.toLowerCase();

		for (int i = 0; i < str.length() / 2; i++) {

			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				flag = false;
				break;

			}
		}
		if (flag)
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not a palindrome");

	}

}
