package coding;

public class Print1To100_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printnum(1);

	}

	private static void printnum(int num) {
		// TODO Auto-generated method stub
		if (num <= 100) {
			System.out.print(" " +num);
			num++;

			printnum(num);

		}

	}

}
