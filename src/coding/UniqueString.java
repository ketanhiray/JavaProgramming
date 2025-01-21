package coding;

public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabccdde";

		for (int i = 0; i < str.length(); i++) {

			char currentChar = str.charAt(i);

			boolean isUnique = true;

			for (int j = 0; j < str.length(); j++) {

				if (i != j && currentChar == str.charAt(j)) {
					isUnique = false;
					break;

				}

			}
			if (isUnique) {
				System.out.print(currentChar + " ");
			}
		}

	}

}
