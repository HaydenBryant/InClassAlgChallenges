import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        if(d > expenditure.length){
            return 0;
        }

        int notifications = 0;
        int median = (int) Math.floor(d / 2);
        System.out.println(median);

        if(d % 2 != 0){

            for(int i = d; i < expenditure.length; i++){
                if(expenditure[i] > (expenditure[median] * 2)){
                    notifications++;
                }
                median++;
            }
        }



        // ArrayList<Integer> lookBackDays = new ArrayList<Integer>();

        // for(int i = 0; i < d; i++){
        //     lookBackDays.add(expenditure[i]);
        // }

        // for(int i = d; i < expenditure.length; i++){
        //     if(expenditure[i] > ((lookBackDaysTotal / d) * 2)){
        //         notifications++;
        //     }
        //     lookBackDaysTotal -= expenditure[i - d];
        //     lookBackDaysTotal += expenditure[i];
        // }

        return notifications;

    }

    // public static int findMedian(ArrayList<Integer> list, int d){
    //     if(d % 2 != 0){
    //         return list.get(d);
    //     } else {

    //     }
    // }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
