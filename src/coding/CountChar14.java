package coding;

import java.util.HashMap;

public class CountChar14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbcccddeef";
		char[] strArray = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<>();

		for (char c : strArray) {

			if (hm.containsKey(c)) {

				hm.put(c, hm.get(c) + 1);

			} else {
				hm.put(c, 1);

			}

		}

		System.out.println(hm);

	}

}
