package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static String[][] board = new String[6][5];  //makes it available to all the methods

    public static void main(String[] args) {
        setUpBoard();
        printBoard();
        for (int i = 0; i < 6; i++) {
            board[getRandomNumber(5) + 1][getRandomNumber(3) + 1] = "[" + (getRandomNumber(9) +1) + "]";
        }

        System.out.println("you have 6 turns, there are 6 treasures to find");
        int treasure =0;
        for (int i = 0; i < 6; i++) {
            System.out.println("turn "+(i+1));

            int column = getcolumn() - 1;
            int row = getrow() - 1;
            System.out.println(column + "," + row);
            if (board[column][row].charAt(1) != ' ') {  //checks if the character at slot 1 is a space and if not then t uses the if loop
                treasure=Integer.parseInt(board[column][row].charAt(1)+"")+treasure ; //Takes a string and converts it to an int (the +"" is to make it a string from a char)
                System.out.println("you found it, total = "+treasure);
            }
//            if(Character.isDigit(board[column][row].charAt(1)) ){ //this would check the character in slot 1 is an integer

//
//            }

        }
        printBoard();
        System.out.println("your total is "+treasure);
    }

    public static int getRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    public static void setUpBoard() {
        //make grid
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = "[ ]";
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }

    public static int getcolumn() {
        Scanner input = new Scanner(System.in);
        System.out.println("pick column (max6) : ");
        int column = input.nextInt();
        while (column < 1 || column > 7) {
            System.out.println("try again");
            System.out.println("pick column: ");
            column = input.nextInt();
        }
        return column;
    }

    public static int getrow() {
        Scanner input = new Scanner(System.in);
        System.out.println("pick row (max 5): ");
        int row = input.nextInt();
        while (row < 1 || row > 6) {
            System.out.println("try again");
            System.out.println("pick row: ");
            row = input.nextInt();
        }
        return row;
    }
}
