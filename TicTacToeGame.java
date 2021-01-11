package com.fellowshipWorkshop;

import java.util.Scanner;
public class TicTacToeGame {
    //Assigning empty space
    public static char[] createBoard()
    {
    	char board[] = new char[10];
        for(int i = 1;i < board.length;i++)
        {
            board[i] = 0;
        }
        return board;
    }
    //Taking user input
    public static char userInput()
    {
    	System.out.println("choose any of option X AND 0");
        Scanner sc=new Scanner(System.in);
        char userValue=sc.next().toUpperCase().charAt(0);
        char userLetter = (userValue == 'X') ? 'X' : '0';
        return userLetter;
    }
    //Printing board
    public static  void showBoard(char[] board) {
        System.out.println("-----------------------");
        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
        System.out.println("|--- --- --- ");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
        System.out.println("|--- --- ---");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
        System.out.println("-----------------------");
    }
    
    
    public static void main(String[] args) {
    	System.out.println("Tic Tac Toe Game");
    	//createBoard();
    	//userInput();
    	showBoard(createBoard());
    }
}
