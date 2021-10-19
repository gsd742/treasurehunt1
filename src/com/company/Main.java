package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Random rand = new Random();
    Scanner input = new Scanner(System.in);

    String [] [] board = new String [10] [8];

    for (int i = 0; i<10; i++){
        for(int j = 0; j<8; j++){
            board[i][j] = "[ ]";
            System.out.print(board[i][j]);
        }
        System.out.println("");
    }
    }
}
