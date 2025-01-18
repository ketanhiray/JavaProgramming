package coding;

public class DuplicateChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabbbcccdddeeff";
		int i, j;
		char k;
		StringBuilder sb = new StringBuilder();

		for (i = 0; i < str.length(); i++) {
			k = str.charAt(i);
			boolean isDuplicate = false;

			for (j = 0; j < sb.length(); j++) {
				if (k == sb.charAt(j)) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				sb.append(k);
				System.out.print(k);
			}
		}

	}

}
