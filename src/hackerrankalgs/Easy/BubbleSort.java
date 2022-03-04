package hackerrankalgs.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(4, 2, 3, 1));
    }

    public static void countSwaps(List<Integer> a) {
        // Write your code here
        int swaps = 0;
        int size = a.size();

        for(int i = 0; i < size; i++){
            int temp = 0;
            for(int j = 0; j < size - 1; j++){
                if(a.get(j) > a.get(j + 1)){
                    temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    swaps++;
                }
            }
        }

        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(size - 1));
    }
}
