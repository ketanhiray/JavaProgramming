package coding;

import java.util.Scanner;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fbs, i;

		System.out.print("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		fbs = sc.nextInt();
		int[] num = new int[fbs];

		num[0] = 0;
		num[1] = 1;

		for (i = 2; i < fbs; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}
		System.out.print("fibonacci Series:");
		for (i = 0; i < fbs; i++) {

			System.out.print(" "+num[i]);
		}

	}

}
