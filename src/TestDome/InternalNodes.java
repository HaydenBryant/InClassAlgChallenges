package TestDome;

import java.util.ArrayList;

public class InternalNodes {
    public static int count(int[] tree){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : tree){
            if(i != -1 && !list.contains(i)){
                list.add(i);
            }
        }

        return list.size();
    }

    public static void main(String[] args) {
        System.out.println(InternalNodes.count(new int[] {1, 3, 1, -1, 3}));
    }
}
