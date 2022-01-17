package hackerrankalgs.Easy;

public class ViralAdvertising {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }

    public static int viralAdvertising(int n) {
        // Write your code here
        int likes = 0;
        int recipients = 5;

        for(int i = 0; i < n; i++){
            recipients = (int) Math.floor(recipients / 2);
            likes += recipients;
            recipients *= 3;
        }

        return likes;
    }
}
