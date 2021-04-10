package hackerrank.tests;

public class SQLQuestions {
    public static void main(String[] args) {
        String CustomerCreditLimit =
                "SELECT ID, NAME FROM CUSTOMER" +
                "WHERE NAME = 'USA'" +
                "AND WHERE CREDITS > 100000" +
                "ORDER BY ID ASC";
    }
}
