package hackerrankalgs.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

        for(int i = 0; i < topic.get(0).length(); i++){
            for(int j = i + 1; j < topic.get(0).length(); j++){

            }
        }

        //check every user to find greatest lists of unique values using sets of combined lists
        //reset temp set after each second is added
        //track number of greatest lists as you iterate until end or greater list is encountered
        //add final max size and number of sets to output and return

        return maxSubjectTeams;
    }
}
