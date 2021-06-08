package hackerrank.tests.CitizenPracticeTest2;

import java.util.ArrayList;
import java.util.List;

public class SlotMachine {

    public static void main(String[] args) {

    }

    public int slotWheels(List<String> history){
        int totalSpins = 0;
        int wheels = history.get(0).length();

        for(int i = wheels; i > 0; i--){
            ArrayList<Integer> maxList = new ArrayList<>();
            for(String s : history){

                for(String num : s.split("")){

                }
            }
        }

        return totalSpins;
    }
}
