package coding;

public class RemoveDuplicateChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabbbccdddeeeff";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char currentChar = str.charAt(i);

			boolean isDuplicate = false;

			for (int j = 0; j < sb.length(); j++) {
				if (currentChar == sb.charAt(j)) {

					isDuplicate = true;
					break;
				}

			}
			if (!isDuplicate) {
				sb.append(currentChar);
			}

		}

		System.out.println("String After Removing Duplicate:"+ sb);
	}

}
