/******************************************************************************
Write a program to print the sum of the elements of the array with the given below condition. If
the array has 6 and 7 in succeeding orders, ignore 6 and 7 and the numbers between them for the
calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22
[i.e 10+3+9]
Eg2) Array Elements - 7,1,2,3,6
O/P:19
Eg3) Array Elements - 1,6,4,7,9
O/P:10  

*******************************************************************************/

public class Sum6to7
{
	public static void main(String[] args) {
		int[] a={7,1,2,3,6};
		int i,j,sol=0;
		int n=a.length;
		for(i=0;i<n;i++)
		{  
		    if(a[i]==6)
		    {
		        if(i==n-1)
		        {
		            sol+=6;
		            System.out.print(sol+" ");
		            return;
		        }
		        j=i+1;
		        while(a[i]!=7&&j!=n-1)
		        {
		           i++;
		           j++;
		        }
		        i++;
		    }
		    sol+=a[i];
		}
		System.out.print(sol+" ");
	}
}
