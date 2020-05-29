// a program to initialize an integer array and print the sum and average of the array. 

package project;

public class SumAndAverage {

	public static void main(String[] args) {
		int[]  a=new int[] {18,27,36,45,54};
		int i=0,sum=0,av=0;
		while(i<a.length)
		{
			sum+=a[i];
			i++;
		}
		av=sum/(a.length);
		System.out.println("Sum is "+sum+" and the Average is "+av);

	}

}
