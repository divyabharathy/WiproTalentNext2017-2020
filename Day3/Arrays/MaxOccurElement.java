/******************************************************************************
Write a program to print the element of an array that has occurred the highest number of times 

*******************************************************************************/

public class MaxOccurElement
{
	public static void main(String[] args) {
		int[] a={5,23,98,55,46,23,55,23};
		int i,j,k=1,l,sol=a[0];
		int n=a.length;
		for(i=0;i<n;i++)
		{   l=k;
		    k=0;
		    for(j=i+1;j<n;j++)
		    {  
		        if(a[i]==a[j])
		        {   
		            k++;
		        }
		    }
		    if(k<l)
		    {
		        k=l;
		        sol=a[i];
		    }
		}
		System.out.print(sol+" ");
	}
}
