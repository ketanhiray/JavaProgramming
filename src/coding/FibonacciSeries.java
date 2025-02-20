package coding;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fb,i;

		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);

		fb = sc.nextInt();

		int[] num = new int[fb];

		num[0] = 0;
		num[1] = 1;

		for ( i = 2; i < fb; i++) {

			num[i] = num[i - 1] + num[i - 2];

		}
		System.out.print("Fibonacci Series::");

		for (i = 0; i < fb; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
