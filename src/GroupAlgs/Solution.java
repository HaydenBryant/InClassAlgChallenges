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
        int group = 2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    dfsUtil(matrix, i, j, group);
                    group++;
                }
            }
        }
        //count group size
        Map<Integer, Integer> counters = new HashMap<>();
        for (int[] row : matrix) {
            for (int cell : row) {
                if (cell == 0) continue;
                if (!counters.containsKey(cell)) {
                    counters.put(cell, 1);
                } else {
                    counters.put(cell, counters.get(cell) + 1);
                }
            }
        }
        int result = 0;
        for (Integer groupCount : counters.keySet()) {
            result = Math.max(counters.get(groupCount), result);
        }
        return result;
    }
    public static void dfsUtil(int[][] matrix, int row, int column, int group) {
        if (row < 0 || column < 0 || row >= matrix.length || column >= matrix[row].length) return;
        if (matrix[row][column] == 0 || matrix[row][column] > 1) return;
        matrix[row][column] = group;
        dfsUtil(matrix, row - 1, column, group);
        dfsUtil(matrix, row + 1, column, group);
        dfsUtil(matrix, row, column + 1, group);
        dfsUtil(matrix, row, column - 1, group);
        dfsUtil(matrix, row - 1, column + 1, group);
        dfsUtil(matrix, row + 1, column - 1, group);
        dfsUtil(matrix, row + 1, column + 1, group);
        dfsUtil(matrix, row - 1, column - 1, group);
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






