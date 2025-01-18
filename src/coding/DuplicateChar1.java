package coding;

public class DuplicateChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbcccdddde";
		StringBuilder sb = new StringBuilder();
		int i, j;
		char k;

		for (i = 0; i < str.length(); i++) {
			k = str.charAt(i);
			boolean isDuplicate = false;

			for (j = 0; j < sb.length(); j++) {

				if (k == sb.charAt(j)) {
					isDuplicate = true;
				}
			}
			if (!isDuplicate) {

				sb.append(k);
				System.out.print(k);
			}

		}

	}

}
