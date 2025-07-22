package coding;

public class ReplaceOwtihSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "tomorrow";
		String result = "";
		int counto = 0;

		for (char c : str.toCharArray()) {

			if (c == 'o') {
				counto++;
				result += "$".repeat(counto);
				

			} else {

				result += c;
			}

		}

		System.out.print(" " +result);
	}

}
