package hackerrankalgs.Easy;

public class DrawingBook {
    public static void main(String[] args) {
        int pages = 6;
        int targetPage = 2;

        System.out.println(pageCount(pages, targetPage));
    }

    public static int pageCount(int n, int p) {
        int front = p / 2;
        int back = (n / 2 - p / 2);

        if(front < back){
            return front;
        } else{
            return back;
        }
    }
}
