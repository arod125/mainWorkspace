import java.util.Arrays;
import java.util.ArrayList;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class board {
    public static void main(String[] args) {
        //                 0   1   2   3   4
        // String top arr = {"1","|","2","|","3"};
        //                 5   6   7   8   9
        //String mid arr = {"4","|","5","|","6"};
        //                 10  11  12  13  14
//        String bot arr = {"7","|","8","|","9"};

        int board[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};//{1,2,3,4,5,6,7,8,9};


        System.out.println("1,2,3");
        System.out.println("4,5,6");
        System.out.println("7,8,9");

        int counter = 0;
        // boolean isGameOver = false;

        while (counter < 9) {
        // Step 1: Get user Input
            Scanner userInput = new Scanner(System.in);

            System.out.print("Make your move! Choose 1-9. ");
            //Num user wants on board
            int userNum = userInput.nextInt();
            //Num in array
            int boardNum = userNum - 1;
        // Step 2: Validate  and add Choice to the board
            // Validate input
            if (board[boardNum] != 0) {
                System.out.println("The spot has been taken. Pick again.");
                // Add Choice. Set boardNum (Index) to board.
            } else {
                board[boardNum] = 1;
            }
        // Step 3: Get computer input, validate and add to board.
            int compNum = 0 + (int)(Math.random() * 9);
            if (board[compNum] != 0) {
                System.out.println("Computer must pick again. Choice is not available. Beep Boop.");
                // Add Choice. Set boardNum (Index) to board.
            } else {
                board[compNum] = 2;
            }

            if ((board[0] == 1 && board[1] == 1 && board[2] == 1)|| (board[3] == 1 && board[4] == 1 && board[5] == 1) || (board[6] == 1 && board[7] == 1 && board[8] == 1)
                    || (board[0] == 1 && board[4] == 1 && board[8] == 1) || (board[2] == 1 && board[4] == 1 && board[6] == 1)){
                System.out.println("User wins the game");
                counter = 9;

            } else if ((board[0] == 2 && board[1] == 2 && board[2] == 2)|| (board[3] == 2 && board[4] == 2 && board[5] == 2) || (board[6] == 2 && board[7] == 2 && board[8] == 2)
                    || (board[0] == 2 && board[4] == 2 && board[8] == 2) || (board[2] == 2 && board[4] == 2 && board[6] == 2)){
                System.out.println("Computer Wins the games");
                counter = 9;
            }
                System.out.print(board[0] + " " + board[1] + " " + board[2]);
                System.out.println("");
                System.out.print(board[3] + " " + board[4] + " " + board[5]);
                System.out.println("");
                System.out.print(board[6] + " " + board[7] + " " + board[8]);
                System.out.println("");
                counter++;
            }

        }
    }