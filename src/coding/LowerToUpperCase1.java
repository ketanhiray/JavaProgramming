package coding;

public class LowerToUpperCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "test plan test case";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i< str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <='z') {
				
				ch -=32;
			}
			
			sb.append(ch);
		}
		System.out.println(sb);
	}

}
