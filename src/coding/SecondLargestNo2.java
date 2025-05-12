package coding;

public class SecondLargestNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 10, 40, 20, 50, 99 };

		int firstN = Integer.MIN_VALUE;
		int secondN = Integer.MIN_VALUE;

		for (int n : nums) {

			if (n > firstN) {

				secondN = firstN;
				firstN = n;

			} else if (n > secondN && n != firstN) {
				secondN = n;
			}
		}
		System.out.println("Second Largest No: " + secondN);
	}

}
