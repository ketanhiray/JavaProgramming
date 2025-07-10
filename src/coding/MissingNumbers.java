package coding;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 2, 4, 5, 6, 7 };

		for (int i = 0; i < num.length - 1; i++) {

			if (num[i + 1] != num[i] + 1) {

				System.out.println(num[i] + 1);
			}
		}

	}

}
