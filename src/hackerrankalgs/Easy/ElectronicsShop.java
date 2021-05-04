package hackerrankalgs.Easy;

import java.util.Arrays;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxPairPrice = 0;

        for(int i = keyboards.length - 1; i >= 0; i--){
            int keyPair = 0;
            for(int j = drives.length - 1; j >= 0; j--){
                keyPair = keyboards[i] + drives[j];
                if(keyPair > maxPairPrice && keyPair <= b)
                    maxPairPrice = keyPair;
            }
        }
        if(maxPairPrice == 0)
            return -1;
        else
            return maxPairPrice;
    }

    public static void main(String[] args) {
        int[] keyboards = new int[]{3, 1};
        int[] drives = new int[]{5, 2, 8};
        int budget = 10;

        getMoneySpent(keyboards, drives, budget);
    }
}
