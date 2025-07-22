package coding;

import java.util.HashSet;

public class RemoveDuplicateChar7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbccddeerrf";
		
		HashSet<Character> hs = new HashSet<>();
		
		for(char c : str.toCharArray()) {
			
			hs.add(c);
			
		}

		System.out.println(hs);
	}

}
