package PracticeTestsHR.Day1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        //plus minus
        List<Integer> arrpm = new ArrayList<>(Arrays.asList(-4, 3, -9, 0, 4, 1));
        plusMinus(arrpm);

        //minMaxSum
        List<Integer> arrmm = new ArrayList<>(Arrays.asList(7, 69, 2, 221, 8974));
        miniMaxSum(arrmm);

        //Time conversion
        String s = "07:05:45PM";
        System.out.println(timeConversion(s));

    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float plus = 0;
        float minus = 0;
        float zero = 0;

        for(int num : arr){
            if(num > 0){
                plus++;
            } else if (num < 0){
                minus++;
            } else {
                zero++;
            }
        }
        int total = arr.size();

        System.out.println(plus / total);
        System.out.println(minus / total);
        System.out.println(zero / total);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long total = 0;

        for(int num : arr){
            min = Math.min(min, num);
            max = Math.max(max, num);
            total += num;
        }

        System.out.format("%d %d", total - max, total - min);
    }

    private static final DateFormat TWELVE_TF = new SimpleDateFormat("hh:mm:ssa");
    private static final DateFormat TWENTY_FOUR_TF = new SimpleDateFormat("HH:mm:ss");

    public static String timeConversion(String s) {
        try {
            return TWENTY_FOUR_TF.format(
                    TWELVE_TF.parse(s));
        } catch (ParseException e) {
            return s;
        }
    }
}
