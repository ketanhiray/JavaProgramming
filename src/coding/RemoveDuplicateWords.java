package coding;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentance = "test data test case test plan ";
		String[] wordArray = sentance.split(" ");
		String result = " ";

		for (int i = 0; i < wordArray.length; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {

				if (wordArray[i].equalsIgnoreCase(wordArray[j])) {

					isDuplicate = true;
					break;

				}
			}
			if (!isDuplicate) {

				result += wordArray[i] + " ";
			}
		}

		System.out.print(" " + result);
	}

}
