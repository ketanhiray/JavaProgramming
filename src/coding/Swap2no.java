package coding;

import java.util.Scanner;

public class Swap2no {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int a, b, temp;

		System.out.println("Enter the Numbers:");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();

		System.out.println("Before:: a= " + a + " b=" + b);
		temp = a;
		a = b;
		b = temp;

		System.out.println("After:: a= " + a + " b=" + b);

	}

}
