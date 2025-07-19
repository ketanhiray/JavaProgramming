package coding;

import java.util.Arrays;

public class MoveZeroToLeft6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 0, 2, 0, 4, 0, 0, 0 };
		int length = arr.length;
		int index = length - 1;

		for (int i = index; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[index] = arr[i];
				index--;

			}

		}
		while (index >= 0) {

			arr[index] = 0;
			index--;
		}
		System.out.println(" " + Arrays.toString(arr));

	}

}
