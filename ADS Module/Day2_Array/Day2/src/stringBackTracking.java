
public class stringBackTracking {
	
	
	public static void main(String[] args) {
		String str="ABC";
		display(str , "");

	}

	private static void display(String str, String result) {
		if(str.length()==0) {
			System.out.println(result);
		
			return;
		}
		for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);    
		
		String temp=str.substring(0, i)+str.substring(i+1);
		
		display(temp, result+ch);    
				
		}
	}

}
