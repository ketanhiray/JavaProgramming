package coding;

public class SumOfDigi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 549;
		int sum = 0;
		int rem;
		while (num != 0) {

			rem = num % 10;
			sum = sum + rem;
			num = num / 10;

		}
		System.out.print(sum);

	}

}
