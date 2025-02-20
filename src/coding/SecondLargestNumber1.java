package coding;

public class SecondLargestNumber1 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 6, 3, 5 };

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > firstLargest) {

				secondLargest = firstLargest;
				firstLargest = arr[i];

			} else if (arr[i] > secondLargest && arr[i] != firstLargest) {

				secondLargest = arr[i];
			}

		}

		if (secondLargest == Integer.MIN_VALUE) {

			System.out.println("There is no second largest element.");

		} else {

			System.out.println("The second largest number is: " + secondLargest);
		}

	}

}
