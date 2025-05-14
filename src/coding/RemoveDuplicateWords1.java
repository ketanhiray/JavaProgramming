package coding;

public class RemoveDuplicateWords1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "test case test plan test data ";
		String[] wordArr = str.split(" ");
		String result = "";

		for (int i = 0; i < wordArr.length; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {

				if (wordArr[i].equalsIgnoreCase(wordArr[j])) {

					isDuplicate = true;
					break;

				}
			}

			if (!isDuplicate) {

				result += wordArr[i] + " ";

			}

		}

		System.out.print(" " + result);

	}

}
