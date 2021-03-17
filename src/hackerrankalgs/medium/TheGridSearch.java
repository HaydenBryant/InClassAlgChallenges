package hackerrankalgs.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TheGridSearch {


    public class Solution {

        // Complete the gridSearch function below.
        static String gridSearch(String[] g, String[] p)
        {
            for(int i = 0; i <= (g.length - p.length); i++)
            {
                for(int j = 0;j <= (g[0].length() - p[0].length()); j++)
                {
                    int row=i;
                    int a=0;

                    if(g[i].substring(j,j+p[0].length()).equals(p[0]))
                    {
                        a++;
                        for(int k=1;k<p.length;k++)
                        {
                            i++;

                            if(g[i].substring(j,j+p[0].length()).equals(p[k])){
                                a++;
                            }
                            else {
                                break;
                            }

                        }
                        if(a == p.length) {
                            return "YES";
                        }
                    }
                    i = row;
                }
            }
            return "NO";
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
