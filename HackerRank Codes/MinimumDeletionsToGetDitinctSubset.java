mport java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'getMinDeletions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int getMinDeletions(String s) {
    // Write your code here
    int count=0;
    ArrayList<Character> t=new ArrayList<Character>(100);
    for(int i=0;i<s.length();i++)
    {
        if(t.contains(s.charAt(i)))
        {
            count++;
            continue;
        }
        t.add(s.charAt(i));
    }
    return count;

    }

}

public class MinimumDeletionsToGetDitinctSubset {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.getMinDeletions(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
