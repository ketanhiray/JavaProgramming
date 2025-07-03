package coding;

public class UpperToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "TesT cASE ";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {

				//ch = (char) (ch + 32);
				ch +=32;
			}

			sb.append(ch);
		}

		System.out.println(sb);
	}

}
