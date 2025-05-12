package coding;

public class PalindromeByUsingSB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
		
		String reverseStr = new StringBuilder(str).reverse().toString();
		
		boolean isPalindrome = str.equalsIgnoreCase(reverseStr );
		
		System.out.println(" Is Palindrome: "+ isPalindrome);

	}

}
