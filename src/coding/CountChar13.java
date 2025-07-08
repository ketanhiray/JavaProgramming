package coding;

import java.util.HashMap;

public class CountChar13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbccdssee";
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
