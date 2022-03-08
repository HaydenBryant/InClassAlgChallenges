package hackerrankalgs.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
    public static void main(String[] args) {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(new ArrayList<>(Arrays.asList(2, 6, 8)));
        queries.add(new ArrayList<>(Arrays.asList(3, 5, 7)));
        queries.add(new ArrayList<>(Arrays.asList(1, 8, 1)));
        queries.add(new ArrayList<>(Arrays.asList(5, 9, 15)));
        int n = 10;
        System.out.println(arrayManipulation(n, queries));
    }

//    public static long arrayManipulation(int n, List<List<Integer>> queries) {
//        // Write your code here
//        long max = -999999;
//        List<Long> listManip = new ArrayList<>();
//        for(long i = 0; i < n; i++){
//            listManip.add((long)0);
//        }
//
//        for(List<Integer> list : queries){
//            long start = list.get(0) - 1;
//            long end = list.get(1) - 1;
//            long add = list.get(2);
//            for(long i = start; i <= end; i++){
//                listManip.set((int)i, listManip.get((int)i) + add);
//                long curr = listManip.get((int)i);
//                if(curr > max){
//                    max = curr;
//                }
//            }
//        }
//
//        return max;
//    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long max = -999999;
        List<Long> listManip = new ArrayList<>();

        for(long i = 0; i < n + 1; i++){
            listManip.add((long)0);
        }

        for(List<Integer> list : queries){
            int a = list.get(0);
            int b = list.get(1);
            int k = list.get(2);
            listManip.set(a - 1, listManip.get(a - 1) + k);
            listManip.set(b, listManip.get(b) - k);
        }

        int temp = 0;
        for(int i = 0; i < listManip.size(); i++){
            temp += listManip.get(i);
            max = Math.max(max, temp);
        }

        return max;
    }
}
