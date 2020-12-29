import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        String noSpaces = s.replaceAll("\\s+","");
        double columns = Math.floor(Math.sqrt(s.length()));
        double rows = Math.ceil(Math.sqrt(s.length()));

        ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>();
        ArrayList<String> temp = new ArrayList<String>();
        int count = 0;
        System.out.println(noSpaces);
        for(String letter : noSpaces.split("")){
            if(count <= columns){
                temp.add(letter);
                count++;
                continue;
            }
            System.out.println(temp);
            array.add(temp);
            temp = new ArrayList<String>();
            temp.add(letter);
            count = 0;

        }
        System.out.println(array);
        return "Done";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
