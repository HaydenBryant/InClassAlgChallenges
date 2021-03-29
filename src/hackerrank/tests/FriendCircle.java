package hackerrank.tests;

import java.util.Arrays;

public class FriendCircle {

    static void DFS (int[][] friends,int friendsSize, int[] visited, int currentFriend){
        for(int i = 0; i < friendsSize; i++){
            if(friends[currentFriend][i] == 1 && visited[i] != 1 && i != currentFriend){
                visited[i] = 1;
                DFS(friends, friendsSize, visited, i);
            }
        }
    }

    static int friendCircles(int[][] friends){
        int friendsSize = friends.length;

        int[] visited = new int[friendsSize];
        Arrays.fill(visited, 0);

        int groups = 0;

        for(int i = 0; i < friendsSize; i++){
            if(visited[i] != 1){
                visited[i] = 1;
                DFS(friends, friendsSize, visited, i);
                groups++;
            }
        }


        return groups;
    }

    public static void main(String args[])
    {
        int n = 4;
        int[][] friends = {
                {1,1,0,0},
                {1,1,1,0},
                {0,1,1,0},
                {0,0,0,1}
        };
        System.out.println("Number of friends circles: " + friendCircles(friends));
    }
}
