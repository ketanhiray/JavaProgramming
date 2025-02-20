package coding;

public class fibonaccis1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fbs = 10;

		int num[] = new int[fbs];

		int i;
		num[0] = 0;
		num[1] = 1;

		for (i = 2; i < fbs; i++) {

			num[i] = num[i - 1] + num[i - 2];

		}
		for (i = 0; i < fbs; i++) {
			System.out.print(" " + num[i]);
		}

	}

}
