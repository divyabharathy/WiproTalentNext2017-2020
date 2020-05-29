//Write a program to reverse a given number and print

package project;
import java.util.Scanner;
public class ReverseDigit {

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
		System.out.println(t+"->"+rev);


	}

}
