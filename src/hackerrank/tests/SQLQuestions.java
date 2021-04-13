package hackerrank.tests;

public class SQLQuestions {
    public static void main(String[] args) {
        String CustomerCreditLimit =
                "SELECT ID, NAME FROM CUSTOMER" +
                "WHERE NAME = 'USA'" +
                "AND WHERE CREDITS > 100000" +
                "ORDER BY ID ASC";

        String YoungestEmployees =
                "SELECT UIN, NAME FROM " +
                        "EMPLOYEE JOIN EMPLOYEE_UIN ON (ID=ID)" +
                        "WHERE AGE < 25" +
                        "ORDER BY NAME ASC, ID ASC";

        String OrderManagementSystem =
                "SELECT ID, NAME FROM CUSTOMER " +
                        "ORDER BY NAME DESC, ID ASC";

        String TheSuperheroesName =
                "SELECT NAME FROM SUPERHERO " +
                        "WHERE LEN(NAME) < 7 " +
                        "ORDER BY ID ASC";
    }
}
