package hackerrankalgs.medium;

import java.util.ArrayList;
import java.util.List;

public class Encryption {
    public static void main(String[] args) {
        String s = "Have a nice day";
        String s1 = "feed the dog";

        System.out.println(encryption(s));
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
                nonEncrypt.add(temp);
                temp = new ArrayList<>();
                temp.add(Character.toString(noSpace.charAt(i)));
            }
            if(i + 1 >= noSpaceLen){
                nonEncrypt.add(temp);
            }
        }


        StringBuilder encrypted = new StringBuilder();


        for(int i = 0; i < high; i++){
            for(int j = 0; j < nonEncrypt.size(); j++){
                if (i >= nonEncrypt.get(j).size()) {
                    continue;
                } else {
                    encrypted.append(nonEncrypt.get(j).get(i));
                }
            }
            encrypted.append(" ");
        }

        return encrypted.toString();

    }
}
