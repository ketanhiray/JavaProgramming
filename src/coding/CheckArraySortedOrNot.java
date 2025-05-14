package coding;

public class CheckArraySortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 9, 5, 6, 8 };

		boolean isSorted = true;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > arr[i + 1]) {

				isSorted = false;
				break;
			}

		}

		if (isSorted) {

			System.out.println("Array is sorted");
		} else {

			System.out.println("Array is not sorted");
		}

	}

}
