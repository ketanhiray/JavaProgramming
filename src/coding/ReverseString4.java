package coding;

public class ReverseString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ketanhiray";

		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			result += str.charAt(i);

		}

		System.out.print(result);
	}

}
