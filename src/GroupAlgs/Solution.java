import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int deletions = 0;

        StringBuilder str = new StringBuilder();
        str.append(s);
        System.out.println(str);

        char currentChar = str.charAt(0);
        System.out.println(currentChar);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == currentChar){
                // str.deleteCharAt(i);
                deletions++;
                currentChar = str.charAt(i);
                continue;
            }
            currentChar = str.charAt(i);
        }
        return deletions;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
