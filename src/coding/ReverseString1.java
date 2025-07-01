package coding;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "automation";
		String result = " ";

		for (int i = str.length() - 1; i >= 0; i--) {

			result += str.charAt(i);
		}

		System.out.println(result);
	}

}
