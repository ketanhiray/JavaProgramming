package coding;

public class ExtractVowels3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcdefghij";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				System.out.print(" " + ch);
			}
		}

	}

}
