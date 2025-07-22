package coding;

public class SortArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 6, 7, 4, 3, 8, 9, 2 };
		int temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int sorted : arr) {

			System.out.print(" " + sorted);
		}

	}

}
