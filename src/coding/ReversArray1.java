package coding;

public class ReversArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] s = { 'a', 'b', 'c', 'd', 'e' };

		char c;
		int left = 0;
		int right = s.length - 1;

		while (left < right) {

			c = s[left];
			s[left] = s[right];
			s[right] = c;

			left += 1;
			right -= 1;

		}
		for (int i = 0; i < s.length; i++) {

			System.out.print(s[i] + " ");
		}

	}

}
