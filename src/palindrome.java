import java.util.*;


public class palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter a String to check if it is a palindrome");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		
		System.out.print(isPalin(in));
		

	}
	
	public static boolean isPalin(String word) {
		
		String reverse = "";
		
		for(int i = word.length() -1 ; i >= 0; i--)
		{
			reverse = reverse + word.charAt(i);
		}
		
		if (word.equalsIgnoreCase(reverse))
			return true;
		else
			return false;
	}

}
