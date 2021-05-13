package hackerrankalgs.Easy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class MinimumDistances {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 1, 3, 4, 1, 7));

        System.out.println(minimumDistances(list));
    }


    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;

        for(int i = 0; i < a.size(); i++){
            int num = a.get(i);
            if(!numMap.containsKey(num)){
                numMap.put(num, i);
            } else {
                int distance = Math.abs(numMap.get(num) - i);
                if(distance < minDistance){
                    minDistance = distance;
                }
            }

        }

        if(minDistance == Integer.MAX_VALUE){
            return -1;
        }
        return minDistance;

    }

}

