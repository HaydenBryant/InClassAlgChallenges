package hackerrankalgs.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AngryProfessor {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1, -3, 4, 2));
        System.out.println(angryProfessor(3, list));
    }
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int students = 0;

        for(int student : a){
            if(student <= 0){
                students++;
            }
        }

        if(students >= k){
            return "NO";
        }
        return "YES";

    }
}
