package hackerrankalgs.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));

        System.out.println(cutTheSticks(arr));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        ArrayList<Integer> outputList = new ArrayList<>();

        while(arr.size() > 0){
            outputList.add(arr.size());
            int smallest = Collections.min(arr);
            Collections.replaceAll(arr, smallest, -1);
            for(int i = 0; i < arr.size(); i++){
                int currStick = arr.get(i);
                if(currStick != -1){
                    arr.set(i, (currStick - smallest));
                }
            }
            arr.removeAll(Collections.singleton(-1));
        }

        return outputList;
    }
}
