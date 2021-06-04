package hackerrank.tests.CitizenPracticeTest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConferenceSchedule {
    public static void main(String[] args) {
        List<Integer> scheduleStart = new ArrayList<>(Arrays.asList(1, 1, 2, 3));
        List<Integer> scheduleEnd = new ArrayList<>(Arrays.asList(2, 3, 3, 4));

        System.out.println(maxPresentations(scheduleStart, scheduleEnd));
    }

    public static int maxPresentations(List<Integer> scheduleStart, List<Integer> scheduleEnd){
        int totalPresentations = 0;

        for(int i = 0; i < scheduleEnd.size(); i++){
            int currentPresentations = 1;

            int presEnd = scheduleEnd.get(i);

            for (int j = 0; j < scheduleEnd.size(); j++){
                if(j == i){
                    continue;
                }

                if(scheduleStart.get(j) >= presEnd){
                    presEnd = scheduleEnd.get(j);
                    currentPresentations++;
                }
            }
            if(currentPresentations > totalPresentations){
                totalPresentations = currentPresentations;
            }
        }

        return totalPresentations;
    }
}
