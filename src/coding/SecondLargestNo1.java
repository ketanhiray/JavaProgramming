package coding;

public class SecondLargestNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {10,70,40,10,80};
		
		int firstN= Integer.MIN_VALUE ,secondN =Integer.MIN_VALUE;
		
		for(int n : nums) {
			
			if(n > firstN) {
				secondN = firstN;
				firstN= n;	
			
			}else if(n > secondN &&  n != firstN) {
				
				secondN = n;
				
			}
				
			}
		System.out.println("Second Largest No: "+ secondN);
			
		}

	}


