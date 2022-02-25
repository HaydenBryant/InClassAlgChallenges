package hackerrankalgs.Easy;

public class MinimumSwaps2 {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};

        System.out.println(minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int swaps = 0;

        for(int i = 0; i < arr.length; i++){
            if(i + 1 != arr[i]){
                int tempIndex = 0;
                int temp = 0;
                for(int j = i; j < arr.length; j++){
                    if(arr[j] == i + 1){
                        tempIndex = j;
                        temp = arr[j];
                        break;
                    }
                }
                arr[tempIndex] = arr[i];
                arr[i] = temp;
                swaps++;
            }
        }
        return swaps;
    }
}
