package personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StringParser {
    public static void main(String[] args) {
        List<String> dbList = new ArrayList<>(Arrays.asList("stamp", "bingo", "drain", "fluff"));
        List<Character> presentLetters = new ArrayList<>(Arrays.asList('i'));
        List<Character> nonPresentLetters = new ArrayList<>(Arrays.asList());
        System.out.println(parser(dbList, presentLetters, nonPresentLetters));
    }

    public static List<String> parser(List<String> dbList,
                                      List<Character> presentLetters,
                                      List<Character> nonPresentLetters){
        List<String> possibleWords = new ArrayList<>();
        String nonPresentLetRegex = ".*[";
        for(char let : nonPresentLetters){
            nonPresentLetRegex += let;
        }
        nonPresentLetRegex += " ].*";

        String presentLetRegex = ".*[";
        for(char let : presentLetters){
            presentLetRegex += let;
        }
        presentLetRegex += " ].*";

        for(String word : dbList){
            //could be string utils from apache but using regex
            if(word.matches(nonPresentLetRegex)){
                continue;
            }
            if(word.matches(presentLetRegex)){
                possibleWords.add(word);
            }
        }

        return possibleWords;
    }

    public static List<String> parserTwo(List<String> dbList,
                                      List<Character> presentLetters,
                                      HashMap<Integer, Character> letterLocation,
                                      List<Character> nonPresentLetters){
        return dbList;
    }
}
