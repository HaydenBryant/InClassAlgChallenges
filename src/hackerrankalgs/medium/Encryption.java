package hackerrankalgs.medium;

public class Encryption {
    public static void main(String[] args) {
        String s = "Have a nice day";

        encryption(s);
    }

    public static String encryption(String s) {
        // Write your code here
        String noSpace = s.replaceAll("\\s", "");

        double high = Math.ceil(Math.sqrt(noSpace.length()));
        double low = Math.floor(Math.sqrt(noSpace.length()));



        return noSpace;

    }
}
