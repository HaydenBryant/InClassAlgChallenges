package hackerrankalgs.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SherlockAndArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 6, 8, 11));
        System.out.println(balancedSums(arr));
    }
    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        int currSum = arr.stream().mapToInt(Integer::intValue).sum() - arr.get(0);
        int leftSum = 0;

        if(currSum == leftSum){
            return "YES";
        }


        for(int i = 1; i < arr.size(); i++){
            leftSum += arr.get(i - 1);
            currSum -= arr.get(i);
            if(currSum == leftSum){
                return "YES";
            }
        }

        return "NO";

    }
}
