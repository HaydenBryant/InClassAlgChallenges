//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//public class hackerrank.tests.ProblemSolvingBasic.Solution {
//
//    // Complete the migratoryBirds function below.
//    static int migratoryBirds(List<Integer> arr) {
//        HashMap<Integer, Integer> birdmap = new HashMap<>();
//
//        for(int bird : arr){
//            if(!birdmap.containsKey(bird)){
//                birdmap.put(bird, 1);
//            } else {
//                birdmap.put(bird, birdmap.get(bird) + 1);
//            }
//        }
//
//        int maxBird = 1;
//
//        for(int bird : birdmap.keySet()){
//            if(birdmap.get(bird) > birdmap.get(maxBird)){
//                maxBird = bird;
//            } else if (birdmap.get(bird) == birdmap.get(maxBird)){
//                maxBird = Math.min(bird, maxBird);
//            }
//        }
//
//        return maxBird;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int result = migratoryBirds(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
