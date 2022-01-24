package hackerrankalgs.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FraudulentActivityNotifications {
    public static void main(String[] args) {
        int d = 4;
        List<Integer> expenditure = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println(activityNotifications(expenditure, d));
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        // Write your code here
        int notifications = 0;
        int median = 0;

        List<Integer> startSubList = expenditure.subList(0, d);

        if (startSubList.size() % 2 != 0){
            median = startSubList.get(startSubList.size() / 2);
        } else {
            median = startSubList.get(startSubList.size() / 2);
            System.out.println(median);
            int tempMedian = startSubList.get(startSubList.size() / 2 + 1);
            System.out.println(tempMedian);
            median = (median + tempMedian) / 2;
        }

        System.out.println(startSubList);

        System.out.println(median);

        return notifications;
    }
}
