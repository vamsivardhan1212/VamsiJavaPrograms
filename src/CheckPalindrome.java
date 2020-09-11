import java.util.*;
public class CheckPalindrome {

	public static void main(String[] args) {
		String original, reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String to check:");
		original=sc.next();
		//it returns the string length
		int len=original.length();
		//for loops is check the letters of string in reverse order to match the same letter in specific position
		//madam
		//in reverse madam
		for(int pos=len-1;pos>=0;pos--)
		{
			reverse=reverse+original.charAt(pos);
		}
		if(original.equals(reverse))
		{
			System.out.println("It is a Palindrome : "+original);
		}
		else
		{
			System.err.println("Not a Palindrome");
		}

	}

}
