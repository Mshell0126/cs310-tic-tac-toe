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
        if (isXTurn){System.out.println("\nPlayer 1 (X) Move:");}
        else{System.out.println("\nPlayer 2 (O) Move:");}
        System.out.println("Enter the row and column numbers, separated by a space: ");
        
        //String input = keyboard.next();
        //int row = Integer.valueOf(input.charAt(0));
        //int col = Integer.valueOf(input.charAt(1));
        
        int row = keyboard.nextInt();
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
