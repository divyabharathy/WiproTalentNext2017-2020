/*Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. After
performing the operation, the program should ask the user if he wants to continue. If the user
presses y or Y, then the program should continue displaying the menu else the program should
terminate. 
*/

package project;
import java.util.Scanner;
public class CalcAddSub {

	public static void main(String[] args) {
		char t='y';
		while(t=='y'||t=='Y')
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the two numbers:");
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println("1. Add  2.Sub");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
				a=a+b;
				System.out.println("The result is "+a);
				break;
			case 2:
				a=a-b;
				System.out.println("The result is "+a);
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do u want to continue:");
			t=s.next().charAt(0);
			}
			return;
		}
}
