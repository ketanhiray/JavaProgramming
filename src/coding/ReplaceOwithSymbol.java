package coding;

public class ReplaceOwithSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//output: T$m$$rr$$$w
		String str = "Tomorrow";
		String result = "";

		int countO = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == 'o') {
				countO++;
				result += "$".repeat(countO);

			} else {
				result += c;
			}

		}

		System.out.println(result);

	}

}
