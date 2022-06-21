package hackerrankalgs.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NonDivisibleSubset {
    public static void main(String[] args) {
        int k = 3;
        List<Integer> s = new ArrayList<>(Arrays.asList(1, 7, 2, 4));
        System.out.println(nonDivisibleSubset(k, s));
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < s.size(); i++){
            int num = s.get(i) % k;
            s.set(i, num);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> temp = new ArrayList<>();
        for(int num : s){
            int remain = k - num;
            if(s.contains(remain)){
                if(!temp.contains(num) && !temp.contains(remain)){
                    int a = freqMap.get(num);
                    int b = freqMap.get(remain);
                    if(a > b){
                        temp.add(a);
                    } else {
                        temp.add(b);
                    }
                }
            }
        }

        s.removeAll(temp);

        return s.size() - 1;
    }
}
