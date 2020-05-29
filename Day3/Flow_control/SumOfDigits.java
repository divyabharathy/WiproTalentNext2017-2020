//Write a program to add all the values in a given number and print. Ex: 1234->10 

package project;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int d,sum=0;
		int t=n;
		while(n!=0)
		{
			d=n%10;
			sum+=d;
			n/=10;
		}
		System.out.println(t+"->"+sum);

	}

}
