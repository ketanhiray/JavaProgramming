package coding;

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 45, 34, 89, 55 };

		int max = arr[0], min = arr[0];

		for (int num : arr) {

			if (num > max)
				max = num;

			if (num < min)
				min = num;

		}

		System.out.println("Maximum No: " + max);
		System.out.println("Minimum No." + min);
	}

}
