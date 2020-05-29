/*a program to initialize an integer array with values and check if a given number is present in
the array or not. If the number is not found, it will print -1 else it will print the index value of the
given number in the array. */

package project;
import java.util.*;
public class SearchArray {

	public static void main(String[] args) {
		int[]  a=new int[] {18,7,365,45,54};
		int i=0,j=0,e;
		Scanner s=new Scanner(System.in);
		e=s.nextInt();
		while(i<a.length)
		{
			if(e==a[i])
			{
				j=1;
				break;
			}
			i++;
		}
		if(j==1)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println("-1");
		}

	}

}
