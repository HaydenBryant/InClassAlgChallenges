package hackerrankalgs.Easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 2));

        System.out.println(pickingNumbers(a));
    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int maxListSize = 0;

        for(int i = 0; i < a.size(); i++){
            List<Integer> tempListHigh = new ArrayList<>();
            List<Integer> tempListLow = new ArrayList<>();
            int num = a.get(i);
            tempListHigh.add(num);
            tempListLow.add(num);
            for(int j = 0; j < a.size(); j++){
                int tempNum = a.get(j);
                if(i == j){
                    continue;
                }
                if(tempNum == num){
                    tempListLow.add(tempNum);
                    tempListHigh.add(tempNum);
                }
                if(num - tempNum == 1){
                    tempListLow.add(tempNum);
                }
                if(num - tempNum == -1){
                    tempListHigh.add(tempNum);
                }
            }
            if(tempListHigh.size() > maxListSize){
                maxListSize = tempListHigh.size();
            }
            if(tempListLow.size() > maxListSize){
                maxListSize = tempListLow.size();
            }

        }

        return maxListSize;
    }
}
