package hackerrankalgs.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceEquation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 1));

        permutationEquation(list);
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> list = new ArrayList<>();
        System.out.println(p);
        for(int i = 1; i < p.size() + 1; i++){
            int x = p.indexOf(i) + 1;
            int y = p.indexOf(x) + 1;

            list.add(y);
        }
        return list;
    }

}
