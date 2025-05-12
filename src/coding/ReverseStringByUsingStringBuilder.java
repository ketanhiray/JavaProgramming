package coding;

public class ReverseStringByUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Ketan";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str);
		sb = sb.reverse();
		
		System.out.println("Reverse String:"+sb);
		
	}

}
