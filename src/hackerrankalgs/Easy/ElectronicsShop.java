package hackerrankalgs.Easy;

import java.util.Arrays;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int maxPairPrice = -1;

        for(int i = 0; i < keyboards.length; i++){
            int tempKeyPairPrice = 0;
            int keyBoard = keyboards[i];
            for(int j = 0; j < drives.length; j++){
                int tempDrivePairPrice = keyBoard + drives[j];
                if(tempDrivePairPrice < b){
                    if(tempDrivePairPrice > tempKeyPairPrice){
                        tempKeyPairPrice = tempDrivePairPrice;
                    }
                }
            }
            if(tempKeyPairPrice > maxPairPrice && tempKeyPairPrice != 0){
                maxPairPrice = tempKeyPairPrice;
            }
        }

        return maxPairPrice;

    }

    public static void main(String[] args) {
        int[] keyboards = new int[]{3, 1};
        int[] drives = new int[]{5, 2, 8};
        int budget = 10;

        getMoneySpent(keyboards, drives, budget);
    }
}
