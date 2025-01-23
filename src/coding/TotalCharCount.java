package coding;

import java.util.Scanner;

public class TotalCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the String: ");
		Scanner sc = new Scanner(System.in);

		String inputStr = sc.nextLine();

		int CharCount = inputStr.length();

		System.out.println("The no. of Character are: " + CharCount);

	}

}
