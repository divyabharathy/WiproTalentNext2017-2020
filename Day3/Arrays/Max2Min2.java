/******************************************************************************
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array

*******************************************************************************/

public class Max2Min2
{
	public static void main(String[] args) {
		int[] arr={18,7,89,53,2};
		int i,max=0,min=arr[0],count=arr.length,max2=0,min2=arr[0];
		for(i = 0; i < count; i++) {
            if(arr[i] > max)
            {
                max2 = max;
                max = arr[i];
            }
            else if(arr[i]>max2)
            {
                max2=arr[i];
            }
            if (arr[i] < min)
            {
                min2 = min;
                min = arr[i];
            }
            else if(arr[i]<min2)
            {
                min2=arr[i];
            }
		}
		System.out.println("Maximum 2 element: "+max+","+max2+" and Minimum 2 element :"+min+","+min2);
		
	}
}
