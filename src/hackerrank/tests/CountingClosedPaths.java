package hackerrank.tests;

public class CountingClosedPaths {
    public static void main(String[] args) {

        int number = 630;

        System.out.println(closedPaths(number));
    }

    public static int closedPaths(int number){
        int closedPaths = 0;

        for(String num : Integer.toString(number).split("")){
            if(num.equals("0") || num.equals("4") || num.equals("6") || num.equals("9")){
                closedPaths++;
            } else if(num.equals("8")){
                closedPaths += 2;
            }
        }

        return closedPaths;
    }
}
