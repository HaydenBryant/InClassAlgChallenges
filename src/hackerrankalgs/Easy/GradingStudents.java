package hackerrankalgs.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>(Arrays.asList(
                85, 95, 21, 0, 18, 100, 18, 62, 30, 61, 55, 0, 45, 2, 29, 55, 61, 40, 14, 4, 29, 100,
                37, 23, 46, 9, 80, 62, 20, 40, 51, 100, 60, 47, 4, 86, 61, 70, 17, 45, 6, 1, 95, 95)
        );

        System.out.println(gradingStudents(grades));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> list = new ArrayList<Integer>();
        for(int marks:grades){
            if(marks < 38 || marks % 5 <= 2){
                list.add(marks);
            }else if(marks % 5 > 2){
                int add = 5 -(marks % 5);
                list.add(marks + add);
            }
        }
        return list;

    }
}
