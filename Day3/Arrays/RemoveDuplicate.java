/******************************************************************************
Write a program to remove the duplicate elements in an array and print 

*******************************************************************************/

public class RemoveDuplicate
{
	public static void main(String[] args) {
		int[] a={5,23,98,55,46,23,82,46};
		int i,j,k;
		int n=a.length;
		for(i=0;i<n;i++)
		{
		    for(j=i+1;j<n;j++)
		    {
		        if(a[i]==a[j])
		        {
		            for(k=j+1;k<n;k++)
		            {
		                a[k-1]=a[k];
		            }
		            n--;
		        }
		    }
		}
		for(i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}
	}
}
