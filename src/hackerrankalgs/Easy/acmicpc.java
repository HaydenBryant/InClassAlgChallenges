package hackerrankalgs.Easy;

import java.lang.reflect.Array;
import java.util.*;

public class acmicpc {
    public static void main(String[] args) {
        List<String> topic =  new ArrayList<>();
        topic.add("10101");
        topic.add("11100");
        topic.add("11010");
        topic.add("00101");
        System.out.println(acmTeam(topic));
    }

    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here
        List<Integer> maxSubjectTeams = new ArrayList<>();

        HashMap<Integer, ArrayList<Integer>> topicMap = new HashMap<>();

        for(int i = 0; i < topic.size(); i++){
            ArrayList<Integer> temp = new ArrayList<>();
            int topics = 1;
            for(String knowledge : topic.get(i).split("")){
                if(knowledge.equals("1")){
                    temp.add(topics);
                }
                topics++;
            }
            topicMap.put(i + 1, temp);
        }

        int size = topicMap.keySet().size();
        int maxKnowledge = 0;
        int maxKnowlPeople = 1;

        for(int i = 0; i < size; i++){
            ArrayList<Integer> baseSet = topicMap.get(i + 1);
            for(int j = i + 1; j < size; j++){
                Set<Integer> set = new HashSet<>(baseSet);
                set.addAll(topicMap.get(j + 1));
                int knowledgeSet = set.size();
                if(knowledgeSet > maxKnowledge){
                    maxKnowledge = set.size();
                    maxKnowlPeople = 1;
                } else if (knowledgeSet == maxKnowledge){
                    maxKnowlPeople++;
                }
            }
        }

        maxSubjectTeams.add(maxKnowledge);
        maxSubjectTeams.add(maxKnowlPeople);

        return maxSubjectTeams;
    }

}
