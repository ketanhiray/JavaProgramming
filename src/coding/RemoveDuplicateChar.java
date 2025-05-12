package coding;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabbbccdde";

		Set<Character> uniqueChar = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {

			uniqueChar.add(str.charAt(i));

		}

		System.out.println(" " + uniqueChar);

	}

}
