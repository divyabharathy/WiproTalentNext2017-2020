/*

HelLoWorld
->HzlLzWzrld

sdfghjkl
->NO VOWELS IN THE STRING


*/


import java.util.*;
public class VowelReplace {
    public static void main(String args[]) {
     Scanner s=new Scanner(System.in);
     String st=s.next();
     int f=0;
     for(int i=0;i<st.length();i++)
     {
         char t=st.charAt(i);
         t=Character.toLowerCase(t);
         if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
         {
             f=1;
             st=st.substring(0,i)+'z'+st.substring(i+1);
         }
     }
         if(f==1)
         {
             System.out.println(st);
         }
         else
         {
             System.out.println("NO VOWELS IN THE STRING");
         }
    }
}
