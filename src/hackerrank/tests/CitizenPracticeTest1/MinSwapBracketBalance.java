package hackerrank.tests.CitizenPracticeTest1;

import java.util.ArrayList;
import java.util.Stack;

public class MinSwapBracketBalance {
    public static void main(String[] args) {
        String brackets = "(()))(";
        String bracketsHard = "))()(()(";


        System.out.println(minimumSwaps(bracketsHard));
    }

    public static int minimumSwaps(String brackets){
        int minSwaps = 0;

        //create stack
        //iterate through brackets
            //put ( in stack
            //check )
            //if balanced disregard both
            //else current enters stack and continue

        //if stack is empty, return minswaps (balanced so 0 swaps)

        //iterate through stack
            //count bracket types

        //if brackets are equal
            //min swaps =   ( / 2 round up?  if odd add 1 divide by 2
            //return minswaps

        //else
            //return -1

        Stack<Character> brackStack = new Stack<>();

        for(char bracket : brackets.toCharArray()){
            if(bracket == '('){
                brackStack.push(bracket);
            } else {
                if(brackStack.empty() || brackStack.peek() == ')'){
                    brackStack.push(bracket);
                } else {
                    brackStack.pop();
                }
            }
        }

        if(brackStack.empty()){
            return minSwaps;
        }

        int open = 0;
        int close = 0;

        while (!brackStack.empty()){
            if(brackStack.pop() == '('){
                 open++;
            } else {
                close++;
            }
        }

        if(open == close){
            if(open % 2 != 0){
                open++;
            }
            minSwaps = open / 2;
            return minSwaps;
        } else {
            return -1;
        }
    }
}
