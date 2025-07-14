package coding;

public class DuplicateChar6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbccddeeffgg";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			boolean isDuplicate = false;

			for (int j = 0; j < sb.length(); j++) {

				if (ch == sb.charAt(j)) {

					isDuplicate = true;
				}
			}

			if (!isDuplicate) {

				sb.append(ch);
			}

		}
		System.out.print(sb);
	}

}
