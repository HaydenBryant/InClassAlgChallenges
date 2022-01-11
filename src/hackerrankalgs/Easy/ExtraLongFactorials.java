package hackerrankalgs.Easy;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        extraLongFactorials(25);
    }

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger fact=BigInteger.valueOf(1);

        for(int i = 1; i <= n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(fact);

    }
}
