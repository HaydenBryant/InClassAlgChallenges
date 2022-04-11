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
}
