import java.io.*;
import  java.util.*;
class FindStringCode
{
  public int toStringCode(String input1)
  {
		int sum=0;
		String sol="";
		String[] s=input1.split(" ");
		int n=s.length;
		for(int i=0;i<n;i++)
		{
			sum=0;
			String t=s[i].toUpperCase();
			for(int j=0;j<t.length()/2+1;j++)
			{
				if(j==(t.length()-1-j))
				{
					sum+=(t.charAt(j)-64);
					break;
				}
				sum+=Math.abs((t.charAt(j)-64)-(t.charAt(t.length()-1-j)-64));
				if(t.length()%2==0&&(t.length()-1)/2==j)
				{
					break;
				}
			}
			sol+=String.valueOf(sum);
		}
		return Integer.parseInt(sol);
	   
	}
}
