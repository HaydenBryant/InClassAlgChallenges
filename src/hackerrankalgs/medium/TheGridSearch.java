package hackerrankalgs.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TheGridSearch {


    public class Solution {

        // Complete the gridSearch function below.
        static String gridSearch(String[] g, String[] p) {
            for(int i = 0; i < (g.length - p.length); i++){
                for(int j = 0; j < (g[i].length() - p[0].length()); j++){
                    if(g[i].substring(j).equals(p[0].substring(0))){
                        int a = 0;
                        int b = 0;
                        for(int k = i; k < (g.length - p.length); k++){
                            for(int l = j; l < (g[i].length() - p[0].length()); l++){
                                if(g[k].substring(l).equals(p[a].substring(b))){
                                    b++;
                                    continue;
                                } else {
                                    break;
                                }
                                a++;
                            }
                        }

                    }
                    if(k == p.length){
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }

            }

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int tItr = 0; tItr < t; tItr++) {
                String[] RC = scanner.nextLine().split(" ");

                int R = Integer.parseInt(RC[0]);

                int C = Integer.parseInt(RC[1]);

                String[] G = new String[R];

                for (int i = 0; i < R; i++) {
                    String GItem = scanner.nextLine();
                    G[i] = GItem;
                }

                String[] rc = scanner.nextLine().split(" ");

                int r = Integer.parseInt(rc[0]);

                int c = Integer.parseInt(rc[1]);

                String[] P = new String[r];

                for (int i = 0; i < r; i++) {
                    String PItem = scanner.nextLine();
                    P[i] = PItem;
                }

                String result = gridSearch(G, P);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            scanner.close();
        }
    }

}
