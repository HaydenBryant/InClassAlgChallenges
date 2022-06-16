package hackerrankalgs.Easy;

public class HalloweenSale {
    public static void main(String[] args) {
        int p = 20;
        int d = 3;
        int m = 6;
        int s = 70;

        System.out.println(howManyGames(p, d, m, s));
    }

    static int howManyGames(int p, int d, int m, int s) {
        if(s < p){
            return 0;
        }
        if(s == p){
            return 1;
        }

        int count = 1;
        int sum = p;

        while(p - d >= m){
            p = p - d;
            if(sum + p > s){
                return count;
            }
            else{
                count++;
                sum += p;
            }
        }

        p = m;
        while(sum + p <= s){
            sum = sum + p;
            count++;
        }
        return count;
    }
}
