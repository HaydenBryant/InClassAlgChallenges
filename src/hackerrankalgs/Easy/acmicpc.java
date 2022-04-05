package hackerrankalgs.Easy;

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

        int person = 1;
        for(String knowledge : topic.get(0).split("")){
            ArrayList<Integer> temp = new ArrayList<>();
            if(knowledge.equals("1")){
                temp.add(1);
                topicMap.put(person, temp);
            } else {
                topicMap.put(person, temp);
            }
            person++;
        }
        person = 1;

        for(int i = 1; i < topic.size(); i++){
            for(String knowledge : topic.get(i).split("")){
                if(knowledge.equals("1")){
                    topicMap.get(person).add(i + 1);
                }
                person++;
            }
            person = 1;
        }

        int maxTopicKnowledge = 0;
        int size = topicMap.keySet().size();
        for(int i = 0; i < size; i++){
            ArrayList<Integer> list = topicMap.get(i + 1);
            for(int j = i + 1; j < size; j++){
                Set<Integer> temp = new HashSet<>(list);
                temp.addAll(topicMap.get(j));
                int currTopicKnowledge = temp.size();
                if(currTopicKnowledge > maxTopicKnowledge){
                    maxTopicKnowledge = currTopicKnowledge;
                    person = 1;
                } else if (currTopicKnowledge == maxTopicKnowledge){
                    person++;
                }
            }
        }

        maxSubjectTeams.add(maxTopicKnowledge);
        maxSubjectTeams.add(person);
        System.out.println(topicMap);

        return maxSubjectTeams;
    }

}
