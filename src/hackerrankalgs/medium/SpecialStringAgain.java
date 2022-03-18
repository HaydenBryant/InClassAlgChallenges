package hackerrankalgs.medium;

public class SpecialStringAgain {
    public static void main(String[] args) {
        String s = "aaaa";
        int n = 4;
        System.out.println(substrCount(n, s));
    }

    static long substrCount(int n, String s) {
        long count = n;
        System.out.println(n);

        long temp = 1;
        for(int i = 0; i < n; i++){
            char curr = s.charAt(i);

            if(i + 1 < n && s.charAt(i + 1) == curr){
                temp++;
                System.out.println(temp);
            } else if(temp > 1){
                temp -= 1;
                temp = temp * (temp + 1) / 2;
                System.out.println("Math is " + temp);
                count = count + temp;
                temp = 1;
            }
        }

        return count;
    }
}
