package coding;

import java.util.HashMap;

public class CountWords3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "test plan test case test data";
		String[] strArray = str.split(" ");

		HashMap<String, Integer> hm = new HashMap<>();

		for (String word : strArray) {

			if (hm.containsKey(word)) {

				hm.put(word, hm.getOrDefault(word, 0)+1);
			} else {
				hm.put(word, 1);
			}

		}

		System.out.println(hm);

	}

}
