package hackerrankalgs.medium;

import java.util.ArrayList;
import java.util.List;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        int p = 1;
        int q = 100;

        kaprekarNumbers(p, q);
    }

    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        List<Long> kaprekarInts = new ArrayList<>();

        for(long i = p; i <= q; i++)
        {
            if(isKaprekar(i)){
                kaprekarInts.add(i);
            }
        }

        if(kaprekarInts.isEmpty()){
            System.out.println("INVALID RANGE");
        } else {
            for(long num : kaprekarInts){
                System.out.print(num + " ");
            }
        }

    }

    public static Boolean isKaprekar(long i){
        long sqr = (long)(i * i);
        String sqrString = String.valueOf(sqr);
        // int digits = (int)(Math.log10(i)+1);

        String l = sqrString.substring(0, sqrString.length() / 2);
        String r = sqrString.substring(sqrString.length() / 2);

        int lInt = (l.isEmpty()) ? 0 : Integer.parseInt(l);
        int rInt = (r.isEmpty()) ? 0 : Integer.parseInt(r);

        if(lInt + rInt == i){
            return true;
        }

        return false;
    }
}
