package coding;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 371;
		int actualNum = num;
		double result = 0;

		while (actualNum > 0) {

			int n = actualNum % 10;
			result = result + Math.pow(n, 3);
			actualNum = actualNum / 10;

		}

		if (result == num) {
			System.out.println(num + " is Armstrong Number");
		} else {
			System.out.println(num + " is Not Armstrong Number");
		}

	}

}
