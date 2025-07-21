package coding;

import java.util.HashSet;

public class RemoveDuplicateChar6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbccddsseeeff";

		HashSet<Character> hs = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {

			hs.add(str.charAt(i));

		}

		System.out.println(hs);

	}

}
