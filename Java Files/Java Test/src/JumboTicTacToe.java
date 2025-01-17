/*
 * Jonathan Graydon
 * JumboTicTacToe
 * This program will play a 7x7 tic tac toe with the user where you must get 4 symbols in a row
 */


import java.util.Scanner;

public class JumboTicTacToe {

    static char[][] board = new char[7][7];
    static char currentPlayer = 'X';
    static Scanner scanner = new Scanner(System.in);

    //----------List of methods to call during the game----------\\

    public static void initializeBoard() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = '-';
            }
        }
    }
    //Print the current board
    public static void displayBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Check if move is valid
    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 7 && col >= 0 && col < 7 && board[row][col] == '-';
    }
    //Check if someone has won
    public static boolean checkWin(int row, int col) {
        char symbol = board[row][col];

        //Check for matching symbols in a row
        for (int start = 0; start <= 3; start++) {
            for (int end = start + 3; end < 7; end++) {
                int count = 0;
                for (int i = start; i <= end; i++) {
                    if (board[row][i] == symbol) {
                        count++;
                    }
                }
                if (count == 4) return true;
            }
        }

        for (int start = 0; start <= 3; start++) {
            for (int end = start + 3; end < 7; end++) {
                int count = 0;
                for (int i = start; i <= end; i++) {
                    if (board[i][col] == symbol) {
                        count++;
                    }
                }
                if (count == 4) return true;
            }
        }

        return false;
    }

    // Check if the board is full
    public static boolean isBoardFull() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    } 
    //-----------------------------------------\\

    //Now the game is run using the created methods
    public static void main(String[] args) {
        initializeBoard();
        displayBoard();

        while (true) {
            System.out.println("Player " + currentPlayer + "'s turn:");
            System.out.print("Enter row (0-6): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-6): ");
            int col = scanner.nextInt();

            // Validate move
            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                displayBoard();

                // Check for a winner
                if (checkWin(row, col)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }

                // Check if the board is full
                if (isBoardFull()) {
                    System.out.println("The game is a draw!");
                    break;
                }

                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }
}
