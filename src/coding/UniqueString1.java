package coding;

public class UniqueString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabcccdddde";

		for (int i = 0; i < str.length(); i++) {
			char k = str.charAt(i);

			boolean isUniuqe = true;

			for (int j = 0; j < str.length(); j++) {
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
