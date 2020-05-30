/******************************************************************************
Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be
passed as Command Line arguments.
Example1:
C:\>java Sample 1 2 3
O/P Expected : Please enter 4 integer numbers
Example2:
C:\>java Sample 1 2 3 4
O/P Expected :

The given array is :
1 2
3 4
The reverse of the array is :
4 3
2 1
*******************************************************************************/

public class Reverse2Darr
{
	public static void main(String[] args) {
	    if(args.length!=4)
	    {
	        System.out.print(" Please enter 4 integer numbers"); 
	        return;
	    }
		int[][] a=new int[2][2];
		int i,j,sol=0;
		for(i=0;i<2;i++)
		{
		    for(j=0;j<2;j++)
		    {
		        a[i][j]=Integer.parseInt(args[sol]);
		        sol++;
		    }
		}
		System.out.println("The given array is :");
		for(i=0;i<2;i++)
		{
		    for(j=0;j<2;j++)
		    {
		        System.out.print(a[i][j]+"\t");
		    }
		    System.out.println("\n");
		}
		System.out.println("The reverse of the array is :");
		for(i=1;i>=0;i--)
		{
		    for(j=1;j>=0;j--)
		    {
		        System.out.print(a[i][j]+"\t");
		    }
		    System.out.println("\n");
		}
	}
}
