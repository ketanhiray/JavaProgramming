package coding;

public class SecondLargeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 10, 50, 20, 60, 80 };

		int firstLarge = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > firstLarge) {

				secondLarge = firstLarge;
				firstLarge = num[i];

			} else if (num[i] > secondLarge && num[i] != firstLarge) {

				secondLarge = num[i];
			}

		}

		if (secondLarge == Integer.MIN_VALUE) {
			System.out.println(" There not largest number");
		} else {

			System.out.println(" Second Largest No: " + secondLarge);
		}
	}

}
