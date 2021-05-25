package hackerrank.tests.CitizenPracticeTest1;

public class MinSwapBracketBalance {
    public static void main(String[] args) {
        String brackets = "(()))(";

        System.out.println(minimumSwaps(brackets));
    }

    public static int minimumSwaps(String brackets){
        int swaps = 0;

        int open = 0;
        int close = 0;
        int current = 0;

        for(String bracket : brackets.split("")){
            if(bracket.equals("(")){
                open++;
                current++;
            }
            if(bracket.equals(")")){
                close++;
                current--;
            }
            if(current < 0){
                swaps++;
                current++;
            }
        }

        if(open == close){
            return swaps;
        }
        return -1;
    }
}
