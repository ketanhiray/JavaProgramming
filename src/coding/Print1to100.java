package coding;

public class Print1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNumbers(1);

	}

	private static void printNumbers(int n) {
		// TODO Auto-generated method stub
		if (n <= 100) {

			System.out.print(" " + n);
			printNumbers(n + 1);

		}

	}

}
