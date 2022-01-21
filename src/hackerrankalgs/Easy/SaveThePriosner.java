package hackerrankalgs.Easy;

public class SaveThePriosner {
    public static void main(String[] args) {
        saveThePrisoner(5, 2, 2);
    }
    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        // int prisonerMod = n % m + s;
        // int prisoner = prisonerMod + Math.abs(prisonerMod % s);
        // return ((m - 1) + (s - 1)) % n + 1;
        int prisoner = (s + m - 1) % n;
        if(prisoner == 0){
            return n;
        }
        return prisoner;

    }
}
