/******************************************************************************
Write a program to initialize an array and print them in a sorted fashion 

*******************************************************************************/

public class SortArray
{
	public static void main(String[] args) {
		int[] arr={18,7,89,53,2};
	    int i,j,t;
	    int n=arr.length;
	    for(i=0;i<n;i++)
	    {
	        for(j=i+1;j<n;j++)
	        {
	            if(arr[i]>arr[j])
	            {
	                t=arr[i];
	                arr[i]=arr[j];
	                arr[j]=t;
	            }
	        }
	    }
		for(i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		
	}
}
