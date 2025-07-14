package coding;

public class ExtractVowels2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbccddeeiioo";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				System.out.print(" " + ch);
			}
		}

	}

}
