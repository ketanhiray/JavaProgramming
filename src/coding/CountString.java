package coding;

import java.util.HashMap;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "test plan test data test case";

		HashMap<String, Integer> hm = new HashMap<>();

		for (String c : str.split(" ")) {

			if (hm.containsKey(c)) {

				hm.put(c, hm.getOrDefault(c, 0) + 1);

			} else {

				hm.put(c, 1);

			}

		}

		System.out.println(hm);

	}

}
