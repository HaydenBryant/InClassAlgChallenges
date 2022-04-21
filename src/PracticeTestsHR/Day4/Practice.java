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

        //superDigit
        String n = "148";
        int k = 3;
        System.out.println(superDigit(n, k));

        //minimumBribes
        List<Integer> q = new ArrayList<>(Arrays.asList(2, 1, 5, 3, 4));
        minimumBribes(q);

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

    public static int superDigit(String n, int k){
        if(n.length() == 1 && k == 1){
            return Integer.valueOf(n);
        }

        long sum = 0;
        for(int i = 0; i < n.length(); i++){
            sum += Character.getNumericValue(n.charAt(i));
        }
        sum *= k;

        return superDigit(Long.toString(sum), 1);
    }

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribes = 0;
        Boolean chaos = false;
        int len = q.size();
        int last = q.get(len - 1);

        for(int i = len - 2; i >= 0; i--){
            int curr = q.get(i);
            if(curr - 1 - i > 2){
                chaos = true;
                break;
            }

            if(curr == i + 3){
                bribes += 2;
            } else if(curr > last){
                bribes++;
            } else {
                last = curr;
            }
        }

        if(chaos){
            System.out.println("Too chaotic");
        } else {
            System.out.println(bribes);
        }
    }

}
