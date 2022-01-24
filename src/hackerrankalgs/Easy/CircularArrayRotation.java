package hackerrankalgs.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {
    public static void main(String[] args) {
        ArrayList a = new ArrayList(Arrays.asList(3, 4, 5));
        int k = 2;
        ArrayList queries = new ArrayList(Arrays.asList(1, 2));

        System.out.println(circularArrayRotation(a, k, queries));
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        // ArrayList<Integer> newList = a;
        // int size = newList.size();

        // for(int i = 0; i < k; i++){
        //     int last = 0;
        //     int next = 0;
        //     for(int j = 0; j < size; j++){
        //         if(j + 1 < size){
        //             last = newList.get(j);
        //             next = newList.get(j + 1);

        //         } else {
        //             newList.set(0, last);
        //         }
        //     }
        // }

        List<Integer> newList = a;

        for(int i = 0; i < a.size(); i++){
            newList.set(( i + k ) % a.size(), a.get(i));
        }

        for(int i = 0; i < queries.size(); i++){
            queries.set(i, newList.get(queries.get(i)));
        }

        return queries;
    }
}
