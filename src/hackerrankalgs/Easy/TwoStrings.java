package hackerrankalgs.Easy;

import java.util.HashMap;

public class TwoStrings {
    public static void main(String[] args) {
        String s1 = "and";
        String s2 = "art";

        System.out.println(twoStrings(s1, s2));
    }

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        HashMap<Character, Integer> charMap = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            char letter = s1.charAt(i);
            if(!charMap.containsKey(letter)){
                charMap.put(letter, 1);
            }
        }

        for(int i = 0; i < s2.length(); i++){
            char letter = s2.charAt(i);
            if(charMap.containsKey(letter)){
                return "YES";
            }
        }

        return "NO";
    }
}
