package hackerrankalgs.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DesignerPDFViewer {

    final static String alph = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        List<Integer> h = new ArrayList<>(Arrays.asList
                (1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7));
        String word = "abc";

        System.out.println(designerPdfViewer(h, word));
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int highlightSize = 0;
        ArrayList<Integer> letterHeights = new ArrayList<>();

        letterHeights = getLetterHeights(getCharAlphIndexs(word), h);

        highlightSize = Collections.max(letterHeights) * letterHeights.size();

        return highlightSize;
    }

    public static ArrayList<Integer> getCharAlphIndexs(String word){
        ArrayList<Integer> charIndexList = new ArrayList<>();

        for(String letter: word.split("")){
            charIndexList.add(alph.indexOf(letter));
        }

        return charIndexList;
    }

    public static ArrayList<Integer> getLetterHeights(ArrayList<Integer> charIndexList, List<Integer> h){
        ArrayList<Integer> letterHeights = new ArrayList<>();

        for(int num : charIndexList){
            letterHeights.add(h.get(num));
        }

        return letterHeights;
    }
}
