package hackerrank.tests.ProblemSolvingBasic;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'minTime' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY files
     *  2. INTEGER numCores
     *  3. INTEGER limit
     */

    public static long minTime(List<Integer> files, int numCores, int limit) {
        long time = 0;

        List<Integer> parList = new ArrayList<>();

        for(int i = 0; i < files.size(); i++){
            int file = files.get(i);
            if(file % numCores == 0){
                parList.add(file);
                files.remove(i--);
            }
        }

        if(parList.size() > limit){
            Collections.sort(parList, Collections.reverseOrder());
        }

        for(int i = 0; i < limit && i < parList.size(); i++){
            parList.set(i, (parList.get(i)/numCores));
        }

        for(int num : parList){
            time += num;
        }
        for(int num : files){
            time += num;
        }

        return time;
    }

}

public class Solution {