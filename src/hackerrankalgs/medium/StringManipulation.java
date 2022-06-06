package hackerrankalgs.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.function.IntToDoubleFunction;

public class StringManipulation {
    public static void main(String[] args) {
        String s = "Hello, how are you.";

        System.out.println(reverseTwo(s));
    }

    public static String reverseOne(String s){
        String out = "";

        for(int i = s.length() - 1; i >= 0; i--){
            out += s.charAt(i);
        }

        return out;
    }

    public static String reverseTwo(String s){
        String out = "";

//        for(String word : s.split(" ")){
//            for(int i = word.length() - 1; i >= 0; i--){
//
//                out += word.charAt(i);
//            }
//            out += " ";
//        }

        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(Character.isLetter(letter)){
                temp.append(letter);
            } else {
                out += temp.reverse().toString();
                out += letter;

                temp = new StringBuilder();
            }
        }

        return out;
    }

    public static String reverseThree(String s){
        String out = "";
        HashMap<Integer, String> outMap = new HashMap<>();

        int place = 0;
        String temp = Character.toString(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            char letter = s.charAt(i);
            if(Character.isLetter(temp.charAt(0)) && Character.isLetter(letter)){
                temp += letter;
            } else if(!Character.isLetter(temp.charAt(0)) && !Character.isLetter(letter)){
                temp += letter;
            } else {
                outMap.put(place, temp);
                temp = Character.toString(letter);
                place++;
            }
        }

//        for(int i = place; i >= 0; i--){
//            out
//        }

        return out;
    }
}
