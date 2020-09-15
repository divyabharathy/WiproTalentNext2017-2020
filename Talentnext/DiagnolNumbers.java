/******************************************************************************
         1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
1234567891987654321
 12345678987654321
  123456787654321
   1234567654321
    12345654321
     123454321
      1234321
       12321
        121
         1

*******************************************************************************/

public class DiagnolNumbers
{
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
		    for(int j=10-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++)
		    {
		        if(j==10)
		        {
		            System.out.print("1");
		        }
		        else{
		        System.out.print(j);
		        }
		    }
		    for(int j=i-1;j>=1;j--)
		    {
		        System.out.print(j);
		    }
		    System.out.println();
		}
		for(int i=1;i<=9;i++)
		{
		    for(int j=i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=10-i;j++)
		    {
		        System.out.print(j);
		    }
		    for(int j=10-i-1;j>=1;j--)
		    {
		        System.out.print(j);

		    }
		    System.out.println();
		}
	}
}
