import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];

    // Initialize board
    static void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Display board
    static void displayBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("\n---|---|---");
            }
        }
        System.out.println();
    }

    // Check winner
    static boolean checkWin() {
        // Rows and Columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ')
                return true;

            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ')
                return true;
        }

        // Diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ')
            return true;

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')
            return true;

        return false;
    }

    // Check draw
    static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int player = 1;
        int row, col;
        char mark;

        initBoard();

        while (true) {
            displayBoard();

            if (player == 1)
                mark = 'X';
            else
                mark = 'O';

            System.out.print("\nPlayer " + player + ", enter row and column (1-3): ");
            row = sc.nextInt();
            col = sc.nextInt();

            row--; // Adjust index
            col--;

            // Validate move
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board[row][col] = mark;

            // Check win
            if (checkWin()) {
                displayBoard();
                System.out.println("\nPlayer " + player + " wins!");
                break;
            }

            // Check draw
            if (checkDraw()) {
                displayBoard();
                System.out.println("\nGame is a draw!");
                break;
            }

            // Switch player
            player = (player == 1) ? 2 : 1;
        }

        sc.close();
    }
}