package hackerrank.tests.IntTest;

import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        System.out.println(maxElement(3, 7, 1));
    }

    public static int maxElement(int n, int maxSum, int k) {
        // Write your code here
        System.out.println(n);
        System.out.println(maxSum);
        System.out.println(k);

        int max = 0;
        int[] arr = new int[n];
        int tempMax =(int) Math.floor(maxSum / n);
        Boolean ovrMaxSum = false;


        while(!ovrMaxSum){
            arr[k] = tempMax;
            int downCount;
            if(tempMax <= 1){
                downCount = 1;
            }
            downCount = tempMax - 1;
            for(int i = k + 1; i < n; i++){
                arr[i] = downCount;
                if(downCount > 1){
                    downCount--;
                }
            }
            if(tempMax <= 1){
                downCount = 1;
            }
            downCount = tempMax - 1;
            for(int i = k - 1; i >= 0; i--){
                arr[i] = downCount;
                if(downCount > 1){
                    downCount--;
                }
            }

            int currSum = Arrays.stream(arr).sum();
            if(currSum > maxSum){
                ovrMaxSum = true;
            } else {
                max = Math.max(tempMax, max);

                tempMax = tempMax + 1;
                arr = new int[n];
            }

        }

        return max;
    }
}
