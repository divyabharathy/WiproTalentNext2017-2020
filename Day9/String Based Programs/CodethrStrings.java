import java.io.*;
import  java.util.*;
class CodethrStrings
{
  public int toCodeStrings(String input1)
  {
		int count=0,val=0;;
		input1=input1.toUpperCase();
		String[] s=input1.split(" ");
		for(int i=0;i<s.length;i++)
		{
			count+=s[i].length();
		}
		while(count/10!=0)
		{
			while(count!=0)
			{
				val+=count%10;
				count/=10;
			}	
			count=val;
		}
		return count;
	}
}
