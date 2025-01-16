package coding;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;

		for (i = 5; i >= 1; i--) {

			for (j = 1; j < i; j++) {

				System.out.print("*");
				System.out.print("\t");
			}

			System.out.println();
		}

	}

}
