package hackerrankalgs.medium;

public class SpecialStringAgain {
    public static void main(String[] args) {
        String s = "aaaadaaaa";
        String s1 = "bbkeihcgbebbheehheeikkekkk";

        System.out.println(substrCount(s.length(), s));
    }

    static long substrCount(int n, String s) {
        long count = n;

        long temp = 1;
        for(int i = 0; i < n; i++){
            char curr = s.charAt(i);

            if(i + 1 < n && s.charAt(i + 1) == curr){
                temp++;
                continue;
            } else if(temp > 1){
                long combos = temp - 1;
                combos = combos * (combos + 1) / 2;
                count += combos;

            }

            if(i + 2 < n && s.charAt(i + 2) == curr){
                long palCount = 0;
                for(int j = i + 2; j < n; j++){
                    if(s.charAt(j) == curr){
                        palCount++;
                    } else {
                        break;
                    }
                }
                count += Math.min(palCount, temp);
                temp = 1;
            }
        }

        return count;
    }
}
