package hackerrankalgs.medium;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {
    static void extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= n; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));

        System.out.println(factorial);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}


