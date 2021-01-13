/**
 * To implement methods into the code.
 *
 * @author (Rienzi Fernandez)
 * @version (1.0)
 */

import java.util.Scanner;

public class BoardPractice
{
    static void clearScreen() {
        System.out.print('\u000C');
    }
    static String[][] buildBoard() {
        String[][] board = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                board[i][j] = "Empty";
            }
        }
        
        return board;
    }
    static void printBoard(String[][] board) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                System.out.print("     " + board[i][j] + "     ");
            }
            System.out.println();
        }
        
    }
    static String[][] customizeBoard(String[][] board) {
        int number = 5;
        int iCount = 0;
        int jCount = 0;
        Scanner key = new Scanner(System.in);
        
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                iCount = j + 1;
                jCount = j + 1;
                System.out.print("Give the value for the string in position " +iCount + ", " + jCount + ": ");
                board[i][j] = key.next();
            }
        }
        
        return board;
    }
    static String[][] changeBoardElement(String[][] board, int x, int y) {
        Scanner key = new Scanner(System.in);
        System.out.print("Give the value for the string in position " + x + ", " + y + ": ");
        board[x][y] = key.next();
        return board;
    }
    public static void main(String[] args) {
        // Initialize Booleans to allow repetition of tasks.
        boolean playAgain = true;
        boolean fillAnElement = true;
        int x, y;
        
        // Initialize an array of length 5.
        
        int number = 5;
        String[][] myBoard = {{"0","0","0","0","0"}, {"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        
        // Create a variable for the user to choose a particular element.
        int elementNumber;
        
        // Initialize scanner.
        Scanner myScanner = new Scanner(System.in);
        
        // The tasks of the program that the user can repeat through the boolean playAgain.
        do {
            clearScreen();

            System.out.println("There is a board to create.");
            
            myBoard = buildBoard();
            
            printBoard(myBoard);
            
            myBoard = customizeBoard(myBoard);
            
            printBoard(myBoard);
            
            System.out.print("You will change one element. Give us the x-coordinate: ");
            x = myScanner.nextInt();
            System.out.print("Now give us the y-coordinate: ");
            y = myScanner.nextInt();
            
            changeBoardElement(myBoard, x, y);
            
            printBoard(myBoard);
            
            System.out.print("Would you like to start this process again!?  Type true or false:  ");
            playAgain = myScanner.nextBoolean();
        } while (playAgain);  // Program loops while user enters true, ends when user enters false.
    }
}