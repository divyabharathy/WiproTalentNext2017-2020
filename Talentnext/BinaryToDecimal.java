/******************************************************************************
1111
->15
101010010000
->2704

*******************************************************************************/
import java.util.*;
public class BinaryToDecimal
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sol=0;
		int t=1;
		long n=s.nextLong();
		while(n!=0)
		{
		    int d=(int)(n%10);
		    sol=sol+d*t;
		    n/=10;
		    t*=2;
		}
		System.out.println(sol);
	}
}
