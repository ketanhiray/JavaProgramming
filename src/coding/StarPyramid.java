package coding;

public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j < i; j++) {
				System.out.print("*");
				System.out.print("\t");

			}
			System.out.println();
		}

	}

}
