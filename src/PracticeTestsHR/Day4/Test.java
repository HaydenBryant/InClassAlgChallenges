package PracticeTestsHR.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<List<Integer>> petrolPumps = new ArrayList<>();
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 5)); petrolPumps.add(a);
        List<Integer> b = new ArrayList<>(Arrays.asList(10, 3)); petrolPumps.add(b);
        List<Integer> c = new ArrayList<>(Arrays.asList(3, 4)); petrolPumps.add(c);
        System.out.println(truckTour(petrolPumps));
    }


    public static int truckTours(List<List<Integer>> petrolpumps) {
        // Write your code here
        long currPetrol = 0;
        int startStation = 0;
        int size = petrolpumps.size();

        for(int i = 0; i < size; i++){
            int gas = petrolpumps.get(i).get(0);
            int nextStationDist = petrolpumps.get(i).get(1);
            currPetrol += gas;

            if(currPetrol < nextStationDist){
                startStation = i + 1;
                currPetrol = 0;
                continue;
            }
            currPetrol -= nextStationDist;
        }

        return startStation;
    }

}
