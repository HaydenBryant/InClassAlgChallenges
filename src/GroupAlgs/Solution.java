import java.util.*;
import java.util.Scanner;
// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{

    public Boolean isBalanced(String s){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(s.split("")));
        if(list.get(0).contains(")")|| list.get(0).contains("}")){
            return false;
        }
        int openParen = 0;
        int closeParen = 0;
        int openBrac = 0;
        int closeBrac = 0;

        for(String item : list){
            switch(item){
                case "(":

                    openParen++;
                    break;
                case ")":

                    closeParen++;
                    break;
                case "{":

                    openBrac++;
                    break;
                case "}":

                    closeBrac++;
                    break;
            }
        }
        if(openBrac == closeBrac && openParen == closeParen){
            return true;
        }
        return false;

    }
}
class Solution {

    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }

        in.close();
    }
}
