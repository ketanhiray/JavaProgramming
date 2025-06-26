package coding;

import java.util.HashSet;

public class RemoveDuplicateChar5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "assdddeerrrtttdfd";

		HashSet<Character> hs = new HashSet<>();

		for (int i = 0; i <str.length();i++) {

			hs.add(str.charAt(i));
			
			//break;
		}
		System.out.println(hs);

	}

}
