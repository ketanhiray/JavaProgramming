package coding;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Qa Team";
		String[] words = str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {

			System.out.print(" "+words[i]);
		}

	}

}
