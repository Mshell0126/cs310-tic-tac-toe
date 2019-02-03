package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeView {
    
    private final Scanner keyboard;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView() {
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);
        
    }
	
    public TicTacToeMove getNextMove(boolean isXTurn) {
        
        /* Prompt the player to enter the row and the column of their next move.
           Return as a TicTacToeMove object. */
        
        // INSERT YOUR CODE HERE
        if (isXTurn){System.out.println("Player 'X',");}
        else{System.out.println("Player 'O',");}
        System.out.println("Please enter the row and column of your next move.");
        System.out.println("row: ");
        int row = keyboard.nextInt();
        System.out.println("column: ");
        int col = keyboard.nextInt();
        TicTacToeMove move = new TicTacToeMove(row, col);
        return move; 

    }

    public void showInputError() {

        System.out.println("Entered location is invalid, already marked, or out of bounds.");

    }

    public void showResult(String r) {

        System.out.println(r + "!");

    }
    
    public void showBoard(String board) {
        
        System.out.println("\n\n" + board);
        
    }
	
}
