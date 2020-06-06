import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'getTime' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static long getTime(String s) {
    // Write your code here
    ArrayList<Integer> c= new ArrayList<Integer>(s.length());
    long t=0;
    int a=65;
    for(int i=0;i<s.length();i++)
    {
        c.add((int)s.charAt(i));
    }
    for(int i:c)
    {
        int temp=Math.abs(a-i);
        if(temp>13)
        {
            temp=Math.abs(temp-26);
        }
        t+=temp;
        a=i;
    }
    return t;
    }

}

public class CircularPrinterTimeTaken {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long result = Result.getTime(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
