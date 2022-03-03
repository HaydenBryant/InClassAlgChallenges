package hackerrankalgs.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountTriplets {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1
        ));
        long r = 1;

        System.out.println(countTriplets(arr, r));
    }

    static long countTriplets(List<Integer> arr, long r) {
        long triplets = 0;
        HashMap<Long, Integer> numMap = new HashMap<>();

        for(long num : arr){
            if(!numMap.containsKey(num)){
                numMap.put(num, 1);
            } else {
                numMap.put(num, numMap.get(num) + 1);
            }
        }

        for(int i = 0; i < arr.size(); i++){
            long curr = arr.get(i);
            long left = 0;
            long right = 0;

            if(numMap.containsKey(curr / r) && numMap.containsKey(curr * r) && curr % r == 0){
                left = numMap.get(curr / r);
                right = numMap.get(curr * r);
            }
            triplets += left * right;
        }

        return triplets;
    }
}
