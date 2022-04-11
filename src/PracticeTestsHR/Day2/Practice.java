package PracticeTestsHR.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        //lonely integer
        List<Integer> a = new ArrayList<>(Arrays.asList(0, 0, 1, 2, 1));
        System.out.println(lonelyinteger(a));

        //Diagonal Difference
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> one = new ArrayList<>(Arrays.asList(11, 2, 4));
        List<Integer> two = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> three = new ArrayList<>(Arrays.asList(10, 8, -12));
        arr.add(one);
        arr.add(two);
        arr.add(three);
        System.out.println(diagonalDifference(arr));
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : a){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : map.keySet()){
            if(map.get(num) == 1){
                ans = num;
                break;
            }
        }
        return ans;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int left = 0;
        int right = 0;
        int arrSize = arr.size() - 1;

        for(int i = 0; i < arr.size(); i++){
            left += arr.get(i).get(i);
            right += arr.get(i).get(arrSize - i);
        }

        return Math.abs(left - right);
    }
}
