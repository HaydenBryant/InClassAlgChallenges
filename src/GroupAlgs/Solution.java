import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the connectedCell function below.
    static int connectedCell(int[][] matrix) {
        int groupCount = 1;
        //pass 1
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                //test for 0
                if(matrix[i][j] == 0){
                    continue;
                }
                //NE
                if (i != 0 && j < matrix[i].length - 1) {
                    if(matrix[i-1][j+1] != 0){
                        matrix[i][j] = matrix[i-1][j+1];
                    }
                }
                //N
                if (i != 0) {
                    if(matrix[i-1][j] != 0){
                        matrix[i][j] = matrix[i-1][j];
                    }
                }
                //NW
                if (i != 0 && j != 0) {
                    if(matrix[i-1][j-1] != 0){
                        matrix[i][j] = matrix[i-1][j-1];
                    }
                }
                //W
                if(j != 0){
                    if(matrix[i][j-1] != 0){
                        matrix[i][j] = matrix[i][j-1];
                    }
                }
                if(matrix[i][j] != 1){
                    continue;
                } else {
                    groupCount++;
                    matrix[i][j] = groupCount;
                }
            }
        }
        // for (var row : matrix) {
        //     System.out.println(Arrays.toString(row));
        // }

        //pass 2
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) continue;
                //E
                if (j < matrix[i].length - 1) {
                    if (matrix[i][j + 1] > 1 && matrix[i][j + 1] < matrix[i][j]) {
                        matrix[i][j] = matrix[i][j + 1];
                    }
                }
                //SE
                if (i < matrix.length - 1 && j < matrix[i].length - 1) {
                    if (matrix[i + 1][j + 1] > 1 && matrix[i + 1][j + 1] < matrix[i][j]) {
                        matrix[i][j] = matrix[i + 1][j + 1];
                    }
                }
                //S
                if (i < matrix.length - 1) {
                    if (matrix[i + 1][j] > 1 && matrix[i + 1][j] < matrix[i][j]) {
                        matrix[i][j] = matrix[i + 1][j];
                    }
                }
                //SW
                if (i < matrix.length - 1 && j != 0) {
                    if (matrix[i + 1][j - 1] > 1 && matrix[i + 1][j - 1] < matrix[i][j]) {
                        matrix[i][j] = matrix[i + 1][j - 1];
                    }
                }
            }
        }
        // for (var row : matrix) {
        //     System.out.println(Arrays.toString(row));
        // }

        HashMap<Integer, Integer> groupMap = new HashMap<>();
        //pass 3
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    continue;
                }

                if(!groupMap.containsKey(matrix[i][j])){
                    groupMap.put(matrix[i][j], 1);
                } else {
                    groupMap.put(matrix[i][j], groupMap.get(matrix[i][j]) + 1);
                }
            }
        }

        int maxGroupCount = 0;

        for(int num : groupMap.keySet()){
            if(groupMap.get(num) > maxGroupCount){
                maxGroupCount = groupMap.get(num);
            }
        }

        return maxGroupCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] matrixRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < m; j++) {
                int matrixItem = Integer.parseInt(matrixRowItems[j]);
                matrix[i][j] = matrixItem;
            }
        }

        int result = connectedCell(matrix);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}






