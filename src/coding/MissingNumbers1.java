package coding;

import java.util.Arrays;

public class MissingNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 4, 5, 6 };

		//Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i + 1] != arr[i] + 1)
				;

			System.out.print(" " + (arr[i] + 1));
			return;
		}

	}

}
