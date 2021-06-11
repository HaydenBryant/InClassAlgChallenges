package hackerrank.tests.CitizenPracticeTest2;

import TestDome.InternalNodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlotMachine {

    public static void main(String[] args) {
        ArrayList<String> history = new ArrayList<>();

        history.add("137");
        history.add("364");
        history.add("115");
        history.add("724");

        System.out.println(slotWheels(history));
    }

    public static int slotWheels(List<String> history){
        int totalSpins = 0;
        int wheels = history.get(0).length();

        ArrayList<Integer> maxList = new ArrayList<>();

        for(int i = wheels; i > 0; i--){

            for(int j = 0; j < history.size(); j++){
                StringBuilder s = new StringBuilder(history.get(j));
                int max = 0;
                int maxDex = 0;
                for(int k = 0; k < s.length(); k++){
                    int temp = Character.getNumericValue(s.charAt(k));
                    if(temp > max){
                        max = temp;
                        maxDex = k;
                    }
                }
                maxList.add(max);
                s.setCharAt(maxDex, '0');
            }
            totalSpins+= Collections.max(maxList);
            maxList = new ArrayList<>();
        }

        return totalSpins;
    }
}
