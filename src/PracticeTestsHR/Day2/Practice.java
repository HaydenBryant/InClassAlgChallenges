package PracticeTestsHR.Day2;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        //lonely integer
        List<Integer> a = new ArrayList<>(Arrays.asList(0, 0, 1, 2, 1));
        System.out.println(lonelyinteger(a));

        //Diagonal Difference
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> one = new ArrayList<>(Arrays.asList(11, 2, 4));
        List<Integer> two = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> three = new ArrayList<>(Arrays.asList(10, 8, -12));
        arr.add(one);
        arr.add(two);
        arr.add(three);
        System.out.println(diagonalDifference(arr));

        //counting sort
        List<Integer> arrcs = new ArrayList<>(Arrays.asList(
                63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25, 81, 56, 9, 53, 98, 67, 99,
                12, 83, 89, 80, 91, 39, 86, 76, 85, 74, 39, 25, 90, 59, 10, 94, 32, 44, 3, 89, 30,
                27, 79, 46, 96, 27, 32, 18, 21, 92, 69, 81, 40, 40, 34, 68, 78, 24, 87, 42, 69, 23,
                41, 78, 22, 6, 90, 99, 89, 50, 30, 20, 1, 43, 3, 70, 95, 33, 46, 44, 9, 69, 48, 33,
                60, 65, 16, 82, 67, 61, 32, 21, 79, 75, 75, 13, 87, 70, 33
        ));
        System.out.println(countingSort(arrcs));
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : a){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : map.keySet()){
            if(map.get(num) == 1){
                ans = num;
                break;
            }
        }
        return ans;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int left = 0;
        int right = 0;
        int arrSize = arr.size() - 1;

        for(int i = 0; i < arr.size(); i++){
            left += arr.get(i).get(i);
            right += arr.get(i).get(arrSize - i);
        }

        return Math.abs(left - right);
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> ans = new ArrayList<Integer>(Collections.nCopies(100, 0));

        for(Integer num : arr){
            ans.set(num, ans.get(num)+1);
        }

        return ans;
    }
}
