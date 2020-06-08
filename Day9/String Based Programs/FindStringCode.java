import java.io.*;
import  java.util.*;
class FindStringCode
{
  public int toStringCode(String input1)
  {
		int temp=0,count,l=0;
		String val="";
		input1=input1.toUpperCase();
		String[] s=input1.split(" ");
		for(int i=0;i<s.length;i++)
		{
			l=0;
			temp=0;
			l=s[i].length()-1;
			if(s[i].length()==1)
			{
				temp=(int)(s[i].charAt(0))-64;	
			}
		    for(int j=0;j<s[i].length()/2;j++)
		    {
				
		    	if(s[i].length()%2!=0&&j==s[i].length()/2-1)
		    	{
		    		temp+=(int)(s[i].charAt(j+1))-64;
		    	}
		       temp+=Math.abs(((int)(s[i].charAt(j))-64)-((int)(s[i].charAt(l))-64));
		       l--;
		    }
		   val+=String.valueOf(temp);
		}
		count=Integer.parseInt(val);
		return count;
	}
}
    
