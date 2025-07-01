package coding;

public class PalindromeWithoutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "level";
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			result += str.charAt(i);
		}

		boolean isPalindrone = str.equalsIgnoreCase(result);

		System.out.println(result);
		System.out.println(isPalindrone);

	}

}
