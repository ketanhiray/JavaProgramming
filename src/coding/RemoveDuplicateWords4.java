package coding;

public class RemoveDuplicateWords4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "test plan test case test result";
		String[] strArray = str.split(" ");
		String Result = "";

		for (int i = 0; i < strArray.length; i++) {

			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {

				if (strArray[i].equalsIgnoreCase(strArray[j])) {

					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				Result += strArray[i] + " ";
			}
		}
		System.out.println(Result + " ");
	}

}
