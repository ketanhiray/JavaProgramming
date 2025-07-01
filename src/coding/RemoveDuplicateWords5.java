package coding;

public class RemoveDuplicateWords5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "test plan test case test result";
		String[] wordArray = str.split(" ");
		String Result = " ";
		
		for(int i=0;i<wordArray.length;i++) {
			
			boolean isDuplicate = false;
			for(int j=0 ;j< i ; j++) {
				
				if(wordArray[i].equalsIgnoreCase(wordArray[j])) {
					
					isDuplicate = true;
					break;
					
				}
			}
			if(!isDuplicate) {
				Result += wordArray[i]+ " ";
			}
			
		}
		System.out.println(Result + " ");

	}

}
