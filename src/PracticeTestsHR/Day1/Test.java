package PracticeTestsHR.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 56, 7, 123, 6, 98, 444));
        System.out.println(findMedian(arr));
    }
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        return (arr.get(arr.size()/2));
    }
}
