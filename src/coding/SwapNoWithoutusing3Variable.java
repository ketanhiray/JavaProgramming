package coding;

import java.util.Scanner;

public class SwapNoWithoutusing3Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;

		System.out.println("Enter the Numbers:");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();

		System.out.println("Before: a= " + a + " b=" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Before: a= " + a + " b=" + b);

	}

}
