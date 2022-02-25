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
        List<Integer> out = a;
        int size = a.size();

        for(int i = 0; i < size; i++){
            int place = i - d;
            int spot = Math.abs(place) % size;

            if(size - spot >= size){
                System.out.println(size - spot);
                out.set(size - spot, a.get(i));
            } else {
                out.set(size - spot, a.get(i));
            }


            System.out.println(size - spot);
        }

        return out;
    }
}
