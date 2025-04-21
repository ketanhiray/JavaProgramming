package coding;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ketanhiray", k = " ";

		for (int i = str.length() - 1; i >= 0; i--) {

			k = k + str.charAt(i);
		}

		System.out.println(k);

	}

}
