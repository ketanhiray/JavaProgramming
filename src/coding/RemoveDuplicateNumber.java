package coding;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num= {1,2,2,2,3,6};
		
		Set<Integer> unique= new HashSet<>();
		
		for(int i=0;i<num.length;i++) {
			
			unique.add(num[i]);
		}
		
		System.out.println(" "+unique);
		
	}

}
