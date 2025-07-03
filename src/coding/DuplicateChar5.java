package coding;

public class DuplicateChar5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbccdddeertt";
		char k;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			boolean isDuplicate = false;
			k = str.charAt(i);

			for (int j = 0; j < sb.length(); j++) {

				if (k == sb.charAt(j)) {

					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {

				sb.append(k);

			}

		}
		System.out.println(sb);
	}

}
