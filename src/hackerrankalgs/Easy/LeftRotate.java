package hackerrankalgs.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotate {
    public static void main(String[] args) {
        int d = 4;
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(rotLeft(a, d));
    }
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List<Integer> out = new ArrayList<>();
        int size = a.size();

        for(int i = 0; i < size; i++){
            out.add(a.get((i + d) % size));
        }

        return out;
    }
}
