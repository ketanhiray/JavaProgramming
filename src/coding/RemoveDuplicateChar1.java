package coding;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabbccdddeegg";

		Set<Character> uniChar = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {

			uniChar.add(str.charAt(i));

		}

		System.out.println(uniChar);

	}

}
