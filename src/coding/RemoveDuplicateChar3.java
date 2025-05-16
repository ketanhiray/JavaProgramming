package coding;

import java.util.HashSet;

public class RemoveDuplicateChar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbbccccdddee";

		HashSet<Character> uniqueChar = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {

			uniqueChar.add(str.charAt(i));

		}

		System.out.println(uniqueChar);
	}

}
