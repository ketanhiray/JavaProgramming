package coding;

import java.util.HashMap;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ketanhirayyy";

		HashMap<Character, Integer> hash_map = new HashMap<>();

		char[] strArray = str.toCharArray();

		for (char c : strArray) {

			if (hash_map.containsKey(c)) {

				hash_map.put(c, hash_map.get(c) + 1);
			} else {

				hash_map.put(c, 1);
			}
		}

		System.out.print(hash_map);
	}

}
