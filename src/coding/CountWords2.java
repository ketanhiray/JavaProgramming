package coding;

import java.util.HashMap;

public class CountWords2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "test plan test case test data";
		
		HashMap<String, Integer> hm= new HashMap<>();
		
		for(String words : str.split(" ")) {
			
			hm.put(words, hm.getOrDefault(words, 0) + 1);
		}
		
		System.out.println(hm);
	}

}
