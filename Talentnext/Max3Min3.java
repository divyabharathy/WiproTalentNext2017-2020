/******************************************************************************

 17
1 32 5 1 2 56 45 5 8 9 10 11 12 5 5 3 2 

o/p:

maximum 3 numbers=56, 45, 32
minimum 3 numbers1, 1, 2

 
 
*******************************************************************************/
import java.util.*;
public class Max3Min3
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		int min1,min2,min3,max1,max2,max3;
		min1=min2=min3=Integer.MAX_VALUE;
		max1=max2=max3=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
		    if(arr[i]>=max1)
		    {
		        max3=max2;
		        max2=max1;
		        max1=arr[i];
		    }
		    else if(arr[i]>=max2)
		    {
		        max3=max2;
		        max2=arr[i];
		    }
		    else if(arr[i]>=max3)
		    {
		        max3=arr[i];
		    }
		    
		    if(arr[i]<=min1)
		    {
		        min3=min2;
		        min2=min1;
		        min1=arr[i];
		    }
		     else if(arr[i]<=min2)
		    {
		        min3=min2;
		        min2=arr[i];
		    }
		    else if(arr[i]<=min3)
		    {
		        min3=arr[i];
		    }
		}
		System.out.println("maximum 3 numbers="+max1+", "+max2+", "+max3+"\n"+"minimum 3 numbers"+min1+", "+min2+", "+min3);
	}
}
