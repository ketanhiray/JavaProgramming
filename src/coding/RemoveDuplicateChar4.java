package coding;

import java.util.HashSet;

public class RemoveDuplicateChar4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbccddddeettt";
		
		HashSet<Character> hs= new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			
			hs.add(str.charAt(i));
			//break;
		}
		System.out.println(hs);
	}

}
