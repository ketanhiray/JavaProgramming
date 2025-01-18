package coding;

public class UniqueChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabccddef";
		int i, j;
		char k;

		for (i = 0; i < str.length(); i++) {
			k = str.charAt(i);
			boolean isUniuqe = true;

			for (j = 0; j < str.length(); j++) {
				if (i != j && k == str.charAt(j)) {
					isUniuqe = false;
					break;
				}

			}
			if (isUniuqe) {
				System.out.print(k);
			}
		}

	}

}
