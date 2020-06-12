import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'closedPaths' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     */

    public static int closedPaths(int number) {
    // Write your code here
    int cp=0,d;
    int n=number;
    while(n!=0)
    {
        d=n%10;
        if(d==0||d==4||d==6||d==9)
        {
            cp+=1;
        }
        else if(d==8)
        {
            cp+=2;
        }
        else
        {
            cp+=0;
        }
        n/=10;
    }
    return cp;
    }

}

public class ClosedPaths {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int number = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.closedPaths(number);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
