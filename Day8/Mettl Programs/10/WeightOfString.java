import java.io.*;
import java.util.*;
class WeightOfString
{
	public String stringWeight(String input1,int input2)
	{
		int t=0,v=0;
		input1=input1.toUpperCase();
		for(int i=0;i<input1.length();i++)
		{
			if(input1.charAt(i)=='A'||input1.charAt(i)=='E'||input1.charAt(i)=='I'||input1.charAt(i)=='O'||input1.charAt(i)=='U')
			{
				v+=(int)input1.charAt(i)-64;
			}
			else if(input1.charAt(i)>='A'&&input1.charAt(i)<='Z')
			{
				t+=(int)input1.charAt(i)-64;
			}
		}
		if(input2==0)
		{
			return t;
		}
		return t+v;
	}
}
