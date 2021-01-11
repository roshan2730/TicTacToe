package com.TicTacToe;

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
    
    public static void main(String[] args) {
    	System.out.println("Tic Tac Toe Game");
    	createBoard();
    }
}
