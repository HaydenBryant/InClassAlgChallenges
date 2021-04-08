package Test2;

import java.util.ArrayList;

public class MergeNames {
    public static String[] uniqueNames(String[] names1, String[] names2) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        ArrayList<String> list = new ArrayList<>();
        for (String name : names1){
            if(!list.contains(name)){
                list.add(name);
            }
        }
        for (String name : names2){
            if(!list.contains(name)){
                list.add(name);
            }
        }

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
