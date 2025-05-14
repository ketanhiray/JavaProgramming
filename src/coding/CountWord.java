package coding;

import java.util.HashMap;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "test data test plan test case";

		HashMap<String, Integer> wordMap = new HashMap<>();

		for (String word : str.split(" ")) {

			wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
		}

		System.out.println(wordMap);
	}

}
