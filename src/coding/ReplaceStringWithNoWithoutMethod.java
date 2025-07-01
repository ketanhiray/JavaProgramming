package coding;

public class ReplaceStringWithNoWithoutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "tomorrow";
		char[] strArray = input.toCharArray();

		String output = " ";

		for (int i = 0; i < strArray.length; i++) {

			char ch = strArray[i];

			if (ch == 'o') {

				output += '3';
			} else if (ch == 'r') {

				output += '2';
			} else {
				output += ch;
			}

		}
		System.out.println(output);
	}

}
