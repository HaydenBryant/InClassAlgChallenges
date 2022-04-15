package PracticeTestsHR.Day3;

public class Test {

    public static void main(String[] args) {
        String s = "hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh";
        System.out.println(palindromeIndex(s));
    }

    public static int palindromeIndex(String s) {
        // Write your code here
        int ans = -1;

        int j = s.length() - 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(j)){
                if(s.charAt(i + 1) == s.charAt(j)){
                    if(s.charAt(i + 2) == s.charAt(j - 1)){
                        ans = i;
                        break;
                    }
                } else if(s.charAt(i) == s.charAt(j - 1)){
                    if(s.charAt(i + 1) == s.charAt(j - 2)){
                        ans = j;
                        break;
                    }
                }
            }

            j--;
        }

        return ans;
    }
}
