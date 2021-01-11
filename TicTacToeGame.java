package com.TicTacToe;
import java.util.Scanner;
public class TicTacToeGame {
    //Assigning empty space
    public static char[] createBoard()
    {
    	char board [] = new char[10];
        for(int i = 1;i < board.length;i++)
        {
            board[i] = 0;
        }
        return board;
    }
    public char userInput()
    {
    	System.out.println("choose any of option X AND 0");
        Scanner sc=new Scanner(System.in);
        char userValue=sc.next().toUpperCase().charAt(0);
        if(userValue == '0' || userValue == 'X')
        {
            return userValue;
        }
        else
        {
            System.out.println("Please provide valid input");
        }
        return 0;
    }
    
    public static void main(String[] args) {
    	System.out.println("Tic Tac Toe Game");
    	TicTacToeGame ticTacToeGame = new TicTacToeGame();
        char[] board = ticTacToeGame.createBoard();
        char userOption = ticTacToeGame.userInput();
    }
}
