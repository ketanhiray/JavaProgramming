package coding;

public class RemoveDuplicateWords2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " test data test case test plan";
		String[] strArray = str.split(" ");
		String result = "";

		for (int i = 0; i < strArray.length; i++) {

			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {

				if (strArray[i].equalsIgnoreCase(strArray[j])) {

					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {

				result += strArray[i];

			}

		}
		System.out.println(" " + result);
	}

}
