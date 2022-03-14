package hackerrankalgs.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(
                4504, 1520, 5857, 4094, 4157, 3902,
                822, 6643, 2422, 7288, 8245, 9948,
                2822, 1784, 7802, 3142, 9739, 5629,
                5413, 7232
        ));
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(
                100, 200, 300, 350, 400, 401, 402
        ));
        int k = 3;
        System.out.println(maxMin(k, arr1));
        int ans = 1335;
    }

    public static int maxMin(int k, List<Integer> arr) {
        int maxMin = Integer.MAX_VALUE;

        Collections.sort(arr);

        for(int i = 0; i <= arr.size() - k; i++){
            List<Integer> temp = arr.subList(i, i + k);
            maxMin = Math.min(maxMin, temp.get(k - 1) - temp.get(0));
        }

        return maxMin;
    }

//    public static int maxMin(int k, List<Integer> arr) {
//        // Write your code here
//        int maxMin = 999999;
//
//        Collections.sort(arr);
//        System.out.println(arr.size() - k);
//
//        for(int i = 0; i <= arr.size() - k; i++){
//            ArrayList<Integer> temp = new ArrayList<>();
//            for(int j = 0; j < k; j++){
//                temp.add(arr.get(j + i));
//            }
//            int max = temp.get(k - 1);
//            int min = temp.get(0);
//            maxMin = Math.min(maxMin, (max - min));
//        }
//
//        return maxMin;
//    }
}
