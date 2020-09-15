/******************************************************************************
Decimal to Binary
5
->101
15
->1111
*******************************************************************************/
import java.util.*;
public class DecimalToBinary
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sol=0;
		int t=1;
		int n=s.nextInt();
		while(n!=0)
		{
		    int d=n%2;
		    sol=sol+d*t;
		    n/=2;
		    t*=10;
		}
		System.out.println(sol);
	}
}
