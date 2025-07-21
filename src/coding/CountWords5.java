package coding;

import java.util.HashMap;

public class CountWords5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Test data Test Case Test Plan";
		String[] strArray = str.split(" ");

		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < strArray.length; i++) {

			String word = strArray[i];

			if (hm.containsKey(word)) {

				hm.put(word, hm.getOrDefault(word, 0) + 1);
			} else {

				hm.put(word, 1);
			}

		}
		System.out.println(hm);

	}

}
