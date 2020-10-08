package com.spring.hockeystats;

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
//        int[][] instructions = new int[][]{{0, 2}, {1, 4}, {0, 3}, {3, 2}};
//        int[] start = new int[]{2, 2};

//        int[] start = getStart();
//        int[][] instructions = getInstructions();

//        int[] end = treasureHunter(getStart(), getInstructions());

        printEnd(treasureHunter(getStart(), getInstructions()));
    }

    public static int[] treasureHunter(int[] start, int[][] instructions){

        for(int[] instruction : instructions){
            switch (instruction[0]){
                case 0:
                    start[1] -= instruction[1];
                    break;
                case 1:
                    start[0] += instruction[1];
                    break;
                case 2:
                    start[1] += instruction[1];
                    break;
                case 3:
                    start[0] -= instruction[1];
                    break;
            }
        }

        return start;
    }

    public static int[] getStart(){
        System.out.println("Please input a starting position using two numbers ex(2 4): ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int[] start = new int[] {x, y};
        return start;
    }

    public static int[][] getInstructions(){
        System.out.println("How many instructions would you like to give?: ");
        int steps = scan.nextInt();
        int[][] instructions = new int[steps][2];

        for (int i = 0; i < steps; i++){
            System.out.println("Please input an instruction using two numbers ex(2 4): ");
            int x = scan.nextInt();
            int y = scan.nextInt();
            int[] step = new int[]{x, y};
            instructions[i] = step;
        }

        return instructions;
    }

    public static void printEnd(int[] end){
        System.out.println("[" + end[0] + ", " + end[1] + "]");
    }
}
