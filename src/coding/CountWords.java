package coding;

import java.util.HashMap;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "test plan test case test data test";

		HashMap<String, Integer> hm = new HashMap<>();

		for (String word : str.split(" ")) {

			hm.put(word, hm.getOrDefault(word, 0) + 1);

		}
		System.out.println(hm);

	}

}
