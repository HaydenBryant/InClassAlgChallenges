package PracticeTestsHR.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        //grid challenge
        List<String> grid = new ArrayList<>();
//        String a = "ebacd"; grid.add(a);
//        String b = "fghij"; grid.add(b);
//        String c = "olmkn"; grid.add(c);
//        String d = "trpqs"; grid.add(d);
//        String e = "xywuv"; grid.add(e);
        String a = "abc"; grid.add(a);
        String b = "hjk"; grid.add(b);
        String c = "mpq"; grid.add(c);
        String d = "rtv"; grid.add(d);
        System.out.println(gridChallenge(grid));


    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        for(int i = 0; i < grid.size(); i++){
            char[] temp = grid.get(i).toCharArray();
            for(int j = 0; j < temp.length; j++){
                for(int k = j + 1; k < temp.length; k++){
                    if (temp[k] < temp[j]) {
                        char curr = temp[j];
                        temp[j] = temp[k];
                        temp[k] = curr;
                    }
                }
            }
            String s = new String(temp);
            grid.set(i, s);
        }

        for(int i = 0; i < grid.get(0).length(); i++){
            for(int j = 0; j < grid.size() - 1; j++){
                if(grid.get(j).charAt(i) > grid.get(j + 1).charAt(i)){
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
