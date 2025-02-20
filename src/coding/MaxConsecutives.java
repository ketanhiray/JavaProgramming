package coding;

public class MaxConsecutives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };

		int maxCount = 0;
		int currentCount = 0;

		for (int num : arr) {

			if (num == 1) {

				currentCount++;
				maxCount = Math.max(maxCount, currentCount);
			} else {

				currentCount = 0;

			}
		}

		System.out.println("Maximum consecutives : " + maxCount);
	}

}
