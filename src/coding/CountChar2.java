package coding;

import java.util.HashMap;

public class CountChar2 {

	public static void main(String[] args) {

		String str = "aabbccddeef";

		HashMap<Character, Integer> hm = new HashMap<>();

		char[] strArray = str.toCharArray();

		for (char c : strArray) {

			if (hm.containsKey(c)) {

				hm.put(c, hm.get(c) + 1);

			} else {
				hm.put(c, 1);

			}

		}
		System.out.print(" " + hm);

	}

}
