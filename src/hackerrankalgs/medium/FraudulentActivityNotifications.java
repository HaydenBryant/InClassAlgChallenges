package hackerrankalgs.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FraudulentActivityNotifications {
    public static void main(String[] args) {
        int d = 4;
        List<Integer> expenditure = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4));

        System.out.println(activityNotifications(expenditure, d));
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        // Write your code here
        int notifications = 0;
        double median;

        List<Integer> subList = expenditure.subList(0, d);
//        for(int i = 0; i < d; i++){
//            subList.add(expenditure.get(i));
//        }


        median = findMedian(subList);

        for (int i = d; i < expenditure.size(); i++){
            int expense = expenditure.get(i);
            if(expense >= 2 * median){
                notifications++;
            }
//            subList.remove(0);
//            subList.add(expense);
            subList.set(i % d, expense);
            median = findMedian(subList);
        }

        return notifications;
    }

    public static double findMedian(List<Integer> subList){
        double median;

        Collections.sort(subList);
        if (subList.size() % 2 != 0){
            median = subList.get(subList.size() / 2);
        } else {
            median = subList.get((subList.size() - 1) / 2);
            double tempMedian = subList.get((subList.size() - 1) / 2 + 1);
            median = (median + tempMedian) / 2;
        }

        return median;
    }
}
