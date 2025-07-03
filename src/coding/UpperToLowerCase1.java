package coding;

public class UpperToLowerCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "HeLLo TeSt";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch > 'A' && ch < 'Z') {

				ch += 32;

			}

			sb.append(ch);
		}

		System.out.println(sb);
	}

}
