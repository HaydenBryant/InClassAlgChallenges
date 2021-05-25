package hackerrank.tests.CitizenPracticeTest1;

public class MinSwapBracketBalance {
    public static void main(String[] args) {
        String brackets = "(()))(";
        String bracketsHard = "))()(()(";

        System.out.println(minimumSwaps(brackets));
    }

    public static int minimumSwaps(String brackets){
        int swaps = 0;

        int open = 0;
        int close = 0;
        int current = 0;

        String[] arr = brackets.split("");

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("(")){
                open++;
                current++;
            }
            if(arr[i].equals(")")){
                close++;
                current--;
            }
            if(current < 0){
                for (int j = i; j < arr.length; j++){
                    if (arr[j].equals("(")){
                        arr[i] = "(";
                        arr[j] = ")";
                        swaps++;
                        current = 0;
                        System.out.println("loop inner run");
                        break;
                    }

                }
            }
        }

        System.out.println(open);
        System.out.println(close);

        if(open == close){
            return swaps;
        }
        return -1;
    }
}
