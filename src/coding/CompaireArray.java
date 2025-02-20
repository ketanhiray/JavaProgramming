package coding;

import java.util.ArrayList;

public class CompaireArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 3, 4, 5, 6 };
		int b[] = { 1, 2, 4, 6, 8 };
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			if (a[i] == b[i]) {

				al.add(a[i]);
			}
		}
		Object[] c = al.toArray();
		for (Object k : c) {
			System.out.print(" " + k);
		}

	}

}
