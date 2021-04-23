package hackerrank.tests.DevsTest1;

import java.util.ArrayList;

public class LastandSecondLast {
    public static void main(String[] args) {
        String string = "apple";

        System.out.println(LastLetter(string));
    }

    static String LastLetter(String string){
        ArrayList<String> list = new ArrayList<>();

        for(int i = string.length() - 1; i > 0; i--){
            list.add(Character.toString(string.charAt(i)));
            if(list.size() == 2){
                break;
            }
        }

        return list.toString();
    }
}
