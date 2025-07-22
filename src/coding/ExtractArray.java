package coding;

public class ExtractArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbccdssseeio";

		for (char c : str.toCharArray()) {

			if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') {

				System.out.print(" " + c);
			}

		}

	}

}
