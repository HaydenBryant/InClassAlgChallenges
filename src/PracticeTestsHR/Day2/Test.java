package PracticeTestsHR.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> a = new ArrayList<>(Arrays.asList(107, 54, 128, 15));
        List<Integer> b = new ArrayList<>(Arrays.asList(12, 75, 110, 138));
        List<Integer> c = new ArrayList<>(Arrays.asList(100, 96, 34, 85));
        List<Integer> d = new ArrayList<>(Arrays.asList(75, 15, 28, 112));
        matrix.add(a);
        matrix.add(b);
        matrix.add(c);
        matrix.add(d);
        System.out.println(flippingMatrix(matrix));
    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int subTotal = 0;
        int size = matrix.size();

        for(int i = 0; i < size / 2; i++){
            for(int j = 0; j < size / 2; j++){
                int curr = matrix.get(i).get(j);
                int right = matrix.get(i).get(size - 1 - j);
                int down = matrix.get(size - 1 - i).get(j);
                int downRight = matrix.get(size - 1 - i).get(size - 1 - j);
                int temp = Math.max(Math.max(curr, right), Math.max(down, downRight));


                subTotal += temp;
            }
        }
        return subTotal;
    }
}
