package hackerrank.tests;

import java.util.ArrayList;

public class ValidEmailAddresses {

    public static void main(String[] args) {
        ArrayList<String> emailList = new ArrayList<>();
        emailList.add("julia@hackerrank.com");
        emailList.add("julia_@hackerrank.com");
        emailList.add("julia_0@hackerrank.com");
        emailList.add("julia0_@hackerrank.com");
        emailList.add("julia@gmail.com");

        for(String email : emailList){
            if(email.matches("[a-z]{1,6}+[_]{0,1}+[1-9]{0,4}+@hackerrank.com")){
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
