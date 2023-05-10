
public class StringPalindrome {

	public static void main(String[] args) {
		String s="NAMAN";
		boolean ans=isPalindrome(s);
		if(ans)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	private static boolean isPalindrome(String s) {
		if(s.length()==0||s.length()==1) {
			return true;
		}
		else {
			if(s.charAt(0)==s.charAt(s.length()-1)) {
				isPalindrome(s.substring(0, s.length()-1));
				return true;
			}
		}
		return false;
	}

}
