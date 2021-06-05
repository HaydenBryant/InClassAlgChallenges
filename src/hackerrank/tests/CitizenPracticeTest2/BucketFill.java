package hackerrank.tests.CitizenPracticeTest2;

import java.util.ArrayList;
import java.util.List;

public class BucketFill {
    public static void main(String[] args) {
        List<String> picture = new ArrayList<>();
        String s1 = "aabba";
        String s2 = "aabba";
        String s3 = "aaacb";
        picture.add(s1);
        picture.add(s2);
        picture.add(s3);

        System.out.println(strokesRequired(picture));
    }

    public static int strokesRequired(List<String> picture){
        int strokes = 0;

        for(String string : picture){
            string.toCharArray();
        }

        char currchar;
        for(int i = 0; i < picture.size(); i++){
            for (int j = 0; j < picture.get(i).length(); j++){
                if(picture.get(i).charAt(j) != 'd'){
                    currchar = picture.get(i).charAt(j);
                }
                //dfs to find current letter
                //loop counts strokes
                //break dfs on non currchar or on 'd'

            }
        }


        return strokes;
    }
}
