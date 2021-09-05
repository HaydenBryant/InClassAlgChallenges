package hackerrankalgs.medium;

import java.util.ArrayList;
import java.util.List;

public class Encryption {
    public static void main(String[] args) {
        String s = "Have a nice day";

        encryption(s);
    }

    public static String encryption(String s) {
        // Write your code here
        String noSpace = s.replaceAll("\\s", "");
        int noSpaceLen = noSpace.length();
        List<List<String>> nonEncrypt = new ArrayList<List<String>>();

        double high = Math.ceil(Math.sqrt(noSpaceLen));
        double low = Math.floor(Math.sqrt(noSpaceLen));

        List<String> temp = new ArrayList<>();
        for(int i = 0; i < noSpaceLen; i++){
            if(temp.size() < high){
                temp.add(Character.toString(noSpace.charAt(i)));
            } else {
                System.out.println("here");
                nonEncrypt.add(temp);
                temp = new ArrayList<>();
                temp.add(Character.toString(noSpace.charAt(i)));
            }
            if(i + 1 >= noSpaceLen){
                System.out.println("here");
                nonEncrypt.add(temp);
            }
        }

        String encrypted = "";

        for(int i = 0; i < nonEncrypt.size(); i++){
            for(int j = 0; j < nonEncrypt.get(i).size(); j++){

            }
        }

        return noSpace;

    }
}
