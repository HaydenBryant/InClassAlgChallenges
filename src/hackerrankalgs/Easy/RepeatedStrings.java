package hackerrankalgs.Easy;

public class RepeatedStrings {
    public static void main(String[] args) {
        String s = "aba";
        long n = 10;

        System.out.println(repeatedString(s, n));
    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        long totalRepeats = 0;

        long repeats = s.chars().filter(ch -> ch == 'a').count();
        double totalStringRep = n / s.length();

        totalRepeats += (repeats * Math.floor(totalStringRep));

        long remainder = n % s.length();

        if(remainder != 0){
            long remainRepeats = s.substring(0, (int)remainder).chars().filter(ch -> ch == 'a').count();
            totalRepeats += remainRepeats;
        }

        return totalRepeats;
    }
}
