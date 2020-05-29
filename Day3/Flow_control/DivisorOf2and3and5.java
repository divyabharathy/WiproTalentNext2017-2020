//Write a program to print first 5 values which are divisible by 2, 3, and 5. 

package project;

public class DivisorOf2and3and5 {

	public static void main(String[] args) {
		int i=1,j=30;
		while(i<=5)
		{
			if(j%2==0&&j%3==0&&j%5==0)
			{
				System.out.println(j);
				i++;
			}
			j++;
		}
			
	}
}
