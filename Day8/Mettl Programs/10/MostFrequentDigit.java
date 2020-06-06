import java.io.*;
import java.util.*;
class MostFrequentDigit
{
	public String highFreqDigit(int input1, int input2, int input3, int input4)
	{
		String s=String.valueOf(input1)+String.valueOf(input2)+String.valueOf(input3)+String.valueOf(input4);
		int[] freq={0,0,0,0,0,0,0,0,0,0};
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			freq[Integer.parseInt(String.valueOf(s.charAt(i)))]++;		
		}
		for(int i=0;i<=9;i++)
		{
			if(freq[i]>=freq[max])
			{
				max=i;
			}
		}
		return max;
	}
}
