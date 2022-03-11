package hackerrankalgs.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FrequencyQueries {
    public static void main(String[] args) {
        List<List<Integer>> queries = new ArrayList<>();
        List<Integer> one = new ArrayList<>(Arrays.asList(1, 3));
        List<Integer> two = new ArrayList<>(Arrays.asList(2, 3));
        List<Integer> three = new ArrayList<>(Arrays.asList(3, 2));
        List<Integer> four = new ArrayList<>(Arrays.asList(1, 4));
        List<Integer> five = new ArrayList<>(Arrays.asList(1, 5));
        List<Integer> six = new ArrayList<>(Arrays.asList(1, 5));
        List<Integer> seven = new ArrayList<>(Arrays.asList(1, 4));
        List<Integer> eight = new ArrayList<>(Arrays.asList(3, 2));
        List<Integer> nine = new ArrayList<>(Arrays.asList(2, 4));
        List<Integer> ten = new ArrayList<>(Arrays.asList(3, 2));
        queries.add(one);
        queries.add(two);
        queries.add(three);
        queries.add(four);
        queries.add(five);
        queries.add(six);
        queries.add(seven);
        queries.add(eight);
        queries.add(nine);
        queries.add(ten);
        System.out.println(freqQuery(queries));
    }

    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> freqQueryOut = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(List<Integer> list : queries){
            int type = list.get(0);
            int data = list.get(1);

            if(type == 1){
                // freqMap.put(data, freqMap.getOrDefault(data, 0) + 1);
                freqMap.merge(data, 1, Integer::sum);
            } else if (type == 2){
                freqMap.computeIfPresent(data, (key, value) -> value - 1);
            } else {
                if(freqMap.containsValue(data)){
                    freqQueryOut.add(1);
                } else {
                    freqQueryOut.add(0);
                }
            }
        }

        return freqQueryOut;
    }
}
