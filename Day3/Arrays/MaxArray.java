//  a program to initialize an integer array and find the maximum and minimum value of an array. 


package project;

public class MaxArray {

	public static void main(String[] args) {
		int[]  a=new int[] {18,7,365,45,54};
		int i=0,j,max=a[0],min=a[0];
		while(i<a.length-1)
		{
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
			i++;
		}
		System.out.println("Maximum element is "+max+" and the Minimum element is "+min);

	}

}
