package hackerrankalgs.Easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class PlusMinus {


    public class Solution {

        // Complete the plusMinus function below.
        static void plusMinus(int[] arr) {
            float posNums = 0;
            float negNums = 0;
            float zeros = 0;

            for(int num : arr){
                if(num < 0){
                    negNums++;
                    continue;
                }
                if(num > 0){
                    posNums++;
                    continue;
                }
                zeros++;
            }

            float arrLen = arr.length;

            System.out.println(posNums / arrLen);
            System.out.println(negNums / arrLen);
            System.out.println(zeros / arrLen);


        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            plusMinus(arr);

            scanner.close();
        }
    }


}
