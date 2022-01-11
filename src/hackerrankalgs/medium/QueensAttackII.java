package hackerrankalgs.medium;

import java.util.List;

public class QueensAttackII {
    public static void main(String[] args) {

    }

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        // Write your code here
        int totalSquares = 0;

        for(int i = 0; i < obstacles.size(); i++){
            if(obstacles.get(i).get(0) == r_q){
                if(obstacles.get(i).get(0) > r_q){
                    totalSquares += (obstacles.get(i).get(0) - r_q);
                }
                if(obstacles.get(i).get(0) < r_q){
                    totalSquares += (r_q - obstacles.get(i).get(0));
                }
            }
        }

        return totalSquares;
    }
}
