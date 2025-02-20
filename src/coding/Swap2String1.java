package coding;

import java.util.Scanner;

public class Swap2String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1, s2;

		System.out.println("Enter the Strings:");
		Scanner in = new Scanner(System.in);
		s1 = in.next();
		s2 = in.next();

		System.out.println("Before: s1= " + s1 + " s2:" + s2);

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("After: s1= " + s1 + " s2:" + s2);

	}

}
