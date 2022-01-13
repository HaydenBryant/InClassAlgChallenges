package hackerrankalgs.medium;

public class FlatlandSPaceStations {
    public static void main(String[] args) {
        int n = 5;
        int[] c = new int[]{ 0, 4 };

        System.out.println(flatlandSpaceStations(n, c));
    }

    static int flatlandSpaceStations(int n, int[] c) {
        int maxDistance = 0;

        for(int i = 0; i < n; i++){
            int currCityMinDist = Math.abs(i - c[0]);

            for(int station : c){
                int currDist = Math.abs(i - station);
                if(currDist < currCityMinDist){
                    currCityMinDist = currDist;
                }
            }

            if(currCityMinDist > maxDistance){
                maxDistance = currCityMinDist;
            }
        }

        return maxDistance;
    }
}
