//Write a Java program to find if the given number is palindrome or not 

package project;
import java.util.Scanner;
public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int d,rev=0;
		int t=n;
		while(n!=0)
		{
			d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		if(t==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}


	}

}
