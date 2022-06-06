package hackerrankalgs.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Pairs {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(
                363374326, 364147530, 61825163, 1073065718, 1281246024,
                1399469912, 428047635, 491595254, 879792181, 1069262793
        ));
        int k = 10;

        System.out.println(pairs(k, arr));
    }

    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        int pairs = 0;
        HashSet<Integer> paired = new HashSet<>();

        for(int num : arr){
            paired.add(num);
        }

        for(int num : arr){
            if(paired.contains(num + k)){
                pairs++;
            }
        }

        return pairs;
    }
}
