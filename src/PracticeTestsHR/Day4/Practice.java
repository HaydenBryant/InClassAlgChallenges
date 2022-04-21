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
//        System.out.println(gridChallenge(grid));

        //superDigit
        String n = "148";
        int k = 3;
        System.out.println(superDigit(n, k));

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

    public static int superDigit(String n, int k) {
        // Write your code here
        int superDigit = 0;
        String p = "";
        for(int i = 0; i < k; i++){
            p += n;
        }

        int sum = 0;
        int i = 0;
        while (i < p.length()){
            sum += Character.getNumericValue(p.charAt(i));

            if(i + 1 == p.length()){
                if(sum > 9){
                    p = String.valueOf(sum);
                    sum = 0;
                    i = 0;
                }
            }
            i++;
        }



        superDigit = sum;
        return superDigit;
    }
}
