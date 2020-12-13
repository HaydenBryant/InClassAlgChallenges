package hackerrank.tests;

//#1

import org.w3c.dom.Node;

import javax.sound.sampled.Line;
import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public static String lastLetters(String word) {
        // Write your code here
        StringBuilder output = new StringBuilder();

        for(int i = word.length() - 2; i < word.length(); i++){
        output.append(word.charAt(i));
        }
        return output.reverse().insert(1, " ", 0, 1).toString();

        }

//#2
public static void fizzBuzz(int n) {
        // Write your code here
        for(int i = 1; i <= n; i++){
        if(i % 3 == 0 && i % 5 == 0){
        System.out.println("FizzBuzz");
        continue;
        }
        if(i % 3 == 0){
        System.out.println("Fizz");
        continue;
        }
        if(i % 5 == 0){
        System.out.println("Buzz");
        continue;
        }
        System.out.println(i);
        }
        }

//#3
class LineList implements ListOfLines {
    public Vector<Line> list_of_lines;
    public LineList(Vector<Line> list_of_lines){
        this.list_of_lines = list_of_lines;
    }
    public Line getLineWithMaxLength(){
        Line longestLine = list_of_lines.get(0);
        for(Line line : list_of_lines){
            if(line.getLineLength() > longestLine.getLineLength()){
                longestLine = line;
            }
        }
        return longestLine;
    }

    public Vector<Line> getLinesFromStartingPoint(Point p){
        Vector<Line> linesFromPoint = new Vector<Line>();

        for(Line line : list_of_lines){
            if(line.getStart() == p){
                linesFromPoint.add(line);
            }
        }

        return linesFromPoint;
    }

}

//#4
private static int isPresent(Node root, int val){
/* For your reference
class Node {
		Node left, right;
		int data;
                Node(int newData) {
			left = right = null;
			data = newData;
		}
	}
*/
    Node trav = root;

    while(true){
        if(trav.data == val){
            return 1;
        }
        if(val > trav.data && trav.right != null){
            trav = trav.right;
            continue;
        } else if (val < trav.data && trav.left != null){
            trav = trav.left;
            continue;
        } return 0;
    }
}

//#5
public static int closedPaths(int number) {
    // Write your code here
    HashMap<String, Integer> closedPaths = new HashMap<>();
    closedPaths.put("0", 1);
    closedPaths.put("4", 1);
    closedPaths.put("6", 1);
    closedPaths.put("9", 1);
    closedPaths.put("8", 2);

    int totalClosedPaths = 0;

    String numString = Integer.toString(number);

    for(String num: numString.split("")){
        if(closedPaths.containsKey(num)){
            totalClosedPaths += closedPaths.get(num);
        }
    }

    return totalClosedPaths;
}

//#6
final static String regularExpression = "[a-z]{1,6}[_]{0,1}[0-9]{0,4}@hackerrank.com";

//#7
public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
    // Write your code here
    int wrongInputs = 0;

    for(int i = 0; i < productSold.size(); i++){
        if(!productPrices.get(products.indexOf(productSold.get(i))).equals(soldPrice.get(i))){
            wrongInputs++;
        }

    }

    return wrongInputs;
}

}

//#8
import java.util.Scanner;
        import java.io.*;


abstract class Car {
    protected boolean isSedan;
    protected String seats;

    public Car(boolean isSedan, String seats) {
        this.isSedan = isSedan;
        this.seats = seats;
    }

    public boolean getIsSedan() {
        return this.isSedan;
    }

    public String getSeats() {
        return this.seats;
    }

    abstract public String getMileage();

    public void printCar(String name) {
        System.out.println(
                "A " + name + " is " + (this.getIsSedan() ? "" : "not ")
                        + "Sedan, is " + this.getSeats() + "-seater, and has a mileage of around "
                        + this.getMileage() + ".");
    }
}
// Write your code here.

/**
 *   WagonR class
 **/
class WagonR extends Car{
    public int mileage;
    public WagonR(int mileage){
        super(false, "4");
        this.mileage = mileage;
    }

    public String getMileage(){
        return ""+mileage + " kmpl";
    }
}
/**
 *   HondaCity class
 **/
class HondaCity extends Car{
    public int mileage;
    public HondaCity(int mileage){
        super(true, "4");
        this.mileage = mileage;
    }

    public String getMileage(){
        return ""+mileage + " kmpl";
    }
}

/**
 *   InnovaCrysta class
 **/
class InnovaCrysta extends Car{
    public int mileage;
    public InnovaCrysta(int mileage){
        super(false, "6");
        this.mileage = mileage;
    }

    public String getMileage(){
        return ""+mileage + " kmpl";
    }
}

//#9
//Not done
public static int countGroups(List<String> related) {
    // Write your code here
    int groups = 0;
    List<String> firstGroup = Arrays.asList(related.get(0));


    for(int i = 1; i < related.size(); i++){
        List<String> tempList = Arrays.asList(related.get(i));
        for()
    }
    return groups;
}

//#10
SELECT ID, NAME FROM CUSTOMER
    WHERE COUNTRY = "USA"
    AND CREDITS > 100000
        ORDER BY ID;
