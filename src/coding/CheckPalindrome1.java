package coding;

public class CheckPalindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Level";
		String result = "";

		//char[] strArray = str.toCharArray();

		for (int i = str.length() - 1; i >= 0; i--) {

			result += str.charAt(i);
			
		}
		
		System.out.println(result);
		
		boolean isPalindrome = str.equalsIgnoreCase(result);
		
		System.out.println(isPalindrome);

	}

}
