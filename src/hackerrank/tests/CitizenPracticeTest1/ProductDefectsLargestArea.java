package hackerrank.tests.CitizenPracticeTest1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductDefectsLargestArea {
    public static void main(String[] args) {
        List<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(1, 1, 1, 0, 0));
        ArrayList<Integer> l4 = new ArrayList<>(Arrays.asList(1, 1, 1, 0, 0));
        ArrayList<Integer> l5 = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);

        System.out.println(largestArea(list));

    }

    public static int largestArea(List<ArrayList<Integer>> samples){
        int maxArea = 0;


        for(int i = 0; i < samples.size(); i++){
            for (int j = 0; j < samples.size(); j++){
                if(samples.get(i).get(j) != 0) {
                    int currentArea = 1;
                    boolean hitZero = true;
                    while (hitZero && currentArea + i < samples.size() && currentArea + j < samples.size()) {
                        for(int k = j; k <= j + currentArea; k++){
                            if(samples.get(i + currentArea).get(k) != 1){
                                hitZero = false;
                                break;
                            }
                        }
                        for(int l = i; l < i + currentArea; l++){
                            if(samples.get(l).get(j + currentArea) != 1){
                                hitZero = false;
                                break;
                            }
                        }
                        if(hitZero == true){
                            currentArea++;
                        }
                    }
                    if(currentArea > maxArea){
                        maxArea = currentArea;
                    }
                }
            }
        }

        return maxArea;
    }
}
