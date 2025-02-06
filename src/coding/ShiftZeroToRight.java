package coding;

public class ShiftZeroToRight {

	public static void main(String[] args) {

		int arr[] = { 0, 0, 0, 1, 1, 0 };

		shiftNumber(arr);

		for (int num : arr) {
			System.out.print(" "+num);
		}

	}

	private static void shiftNumber(int[] arr) {

		int index = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}

		}

		while (index < arr.length) {
			arr[index++] = 0;

		}

	}

}
