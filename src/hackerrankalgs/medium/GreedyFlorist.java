package hackerrankalgs.medium;

import java.util.Arrays;

public class GreedyFlorist {
    public static void main(String[] args) {
        int k = 3;
        int[] c = {1, 3, 5, 7, 9};
        System.out.println(getMinimumCost(k, c));
    }

    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);

        int flowers = 0;
        int freq = 1;
        int cost = 0;

        for (int i = c.length - 1; i >= 0; i--) {

            if (flowers < k) {
                cost += c[i];
            } else {
                freq = flowers / k;
                cost += (freq + 1) * c[i];
            }
            flowers++;
        }
        return cost;
    }
}
