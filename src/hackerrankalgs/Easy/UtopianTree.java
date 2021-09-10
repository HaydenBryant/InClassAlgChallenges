package hackerrankalgs.Easy;

public class UtopianTree {
    public static void main(String[] args) {
        System.out.println(utopianTree(5));
    }

    public static int utopianTree(int n) {
        // Write your code here
        int sapling = 1;

        boolean dbl = true;

        for(int i = n; i > 0; i--){
            if(dbl){
                sapling *= 2;
                dbl = false;
            } else {
                sapling += 1;
                dbl = true;
            }
        }

        return sapling;
    }
}
