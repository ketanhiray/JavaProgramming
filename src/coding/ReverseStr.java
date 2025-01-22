package coding;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ketanhiray", k = " ";

		for (int i = str.length() - 1; i >= 0; i--) {
			k += str.charAt(i);

		}

		System.out.println(k);
	}

}
