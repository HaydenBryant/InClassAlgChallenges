package hackerrankalgs.Easy;

import java.util.HashMap;

public class MakingAnagrams {
    public static void main(String[] args) {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        System.out.println(makeAnagram(a, b));
    }

    public static int makeAnagram(String a, String b) {
        // Write your code here
        int deletions = 0;
        HashMap<String, Integer> letMapA = new HashMap<>();
        HashMap<String, Integer> letMapB = new HashMap<>();

        for(String let : a.split("")){
            letMapA.merge(let, 1, Integer::sum);
        }
        for(String let : b.split("")){
            letMapB.merge(let, 1, Integer::sum);
        }

        for(String let : letMapA.keySet()){
            if(letMapB.containsKey(let)){
                deletions += Math.abs(letMapA.get(let) - letMapB.get(let));
                letMapB.remove(let);
            } else {
                deletions += letMapA.get(let);
            }
        }

        for(String let : letMapB.keySet()){
            deletions += letMapB.get(let);
        }

        return deletions;
    }
}
