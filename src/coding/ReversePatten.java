package coding;

public class ReversePatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, k = 1;

		for (i = 6; i > 1; i--) {

			for (j = 1; j <= i; j++) {

				System.out.print(k);
				System.out.print("\t");
				k++;

			}

			System.out.println("");
		}

	}

}
