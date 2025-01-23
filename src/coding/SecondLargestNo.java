package coding;

public class SecondLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 8, 4, 9, 2 };
		int i, j, temp;

		for (i = 0; i < arr.length; i++) {

			for (j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}

		for (i = arr.length - 2; i >= 0; i--) {

			if (arr[i] != arr[arr.length - 1]) {

				System.out.println("Second Largest is: " + arr[i]);
				break;
			}
		}

	}

}
