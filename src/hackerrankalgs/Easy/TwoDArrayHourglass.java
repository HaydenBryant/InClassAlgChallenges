package hackerrankalgs.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDArrayHourglass {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> one = new ArrayList<>(Arrays.asList(1, 1, 1, 0, 0, 0));
        ArrayList<Integer> two = new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0, 0));
        ArrayList<Integer> three = new ArrayList<>(Arrays.asList(1, 1, 1, 0, 0, 0));
        ArrayList<Integer> four = new ArrayList<>(Arrays.asList(0, 0, 2, 4, 4, 0));
        ArrayList<Integer> five = new ArrayList<>(Arrays.asList(0, 0, 0, 2, 0, 0));
        ArrayList<Integer> six = new ArrayList<>(Arrays.asList(0, 0, 1, 2, 4, 0));

        arr.add(one);
        arr.add(two);
        arr.add(three);
        arr.add(four);
        arr.add(five);
        arr.add(six);

        System.out.println(hourglassSum(arr));
    }

    public static int hourglassSum(ArrayList<ArrayList<Integer>> arr) {
        // Write your code here
        int maxSum = Integer.MIN_VALUE;
        int size = arr.size() - 2;

        for(int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                int temp = 0;
                temp += arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                temp += arr.get(i + 1).get(j + 1);
                temp += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                maxSum = Math.max(maxSum, temp);
            }

        }

        return maxSum;
    }
}
