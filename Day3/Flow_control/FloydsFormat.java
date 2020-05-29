//Write a program to print * in Floyds format (using for and while loop)
//*
//* *
//* * * 


package project;

public class FloydsFormat {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.print("Please enter an integer number");
			return;
		}
		int n=Integer.parseInt(args[0]);
		int j=1;
		while(j<=n)
		{
			for(int i=1;i<=j;i++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
			j++;
		}

	}

}
