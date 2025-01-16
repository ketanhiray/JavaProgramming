package coding;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ketan", k = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			k = k + s.charAt(i);
		}
		System.out.println(k);

	}

}
