package coding;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 20, 10, 50, 30, 60, 5 };

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
