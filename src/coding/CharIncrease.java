package coding;

public class CharIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "a2b3c4d5";
		int i, j, a;

		for (i = 0; i < str.length(); i++) {

			if (Character.isAlphabetic(str.charAt(i))) {

				System.out.print(str.charAt(i));
			} else {

				a = Character.getNumericValue(str.charAt(i));

				for (j = 1; j < a; j++) {

					System.out.print(str.charAt(i-1));
				}
			}
		}

	}

}
