package hackerrankalgs.Easy;

public class LibraryFine {
    public static void main(String[] args) {
        System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        if(y2 < y1){
            return 10000;
        }
        if(m2 < m1){
            return (500 * Math.abs(m1 - m2));
        }
        if(d2 < d1){
            return (15 * Math.abs(d1 - d2));
        }
        return 0;
    }
}
