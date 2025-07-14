package coding;

public class SortArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 50, 10, 40, 20, 30 };
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
