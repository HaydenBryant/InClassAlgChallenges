package hackerrankalgs.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FairRations {
    public static void main(String[] args) {
        List<Integer> B = new ArrayList<>(Arrays.asList(4, 5, 6, 7));

        System.out.println(fairRations(B));
    }

    public static String fairRations(List<Integer> B) {
        // Write your code here
        int loaves = 0;

        for(int i = 0; i < B.size() - 1; i++){
            if(B.get(i) % 2 != 0){
                B.set(i, B.get(i) + 1);
                B.set(i + 1, B.get(i + 1) + 1);
                loaves += 2;
            }
        }

        if (B.get(B.size() - 1) % 2 != 0){
            return "NO";
        }

        return Integer.toString(loaves);
    }
}
