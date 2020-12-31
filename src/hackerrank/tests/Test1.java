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
        double rows = Math.floor(Math.sqrt(s.length()));
        double columns = Math.ceil(Math.sqrt(s.length()));

        ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>();
        ArrayList<String> temp = new ArrayList<String>();

        int count = 0;

        for(String letter : noSpaces.split("")){
            temp.add(letter);
            count++;
            if(count == columns){
                array.add(temp);
                temp = new ArrayList<String>();
                count = 0;
                continue;
            }

        }

        String output = "";
        // System.out.println(array);

        for(int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                if(((j * columns) + i) < (s.length())){
                    output += array.get(j).get(i);
                }
            }
            if(i < (columns - 1)){
                output+=" ";
            }
        }
        return output;

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
