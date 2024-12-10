package FAT;

/*
Time Complexity: O(N!):
Space Complexity: O(N^2):
 (For the chessboard and recursion stack)
 */

import java.util.*;

public class N_Queens {
    private static void solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the chessboard with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Start solving from the first row
        solve(0, board, solutions, n);

        // Print all solutions
        System.out.println("Total Solutions: " + solutions.size());
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    private static void solve(int row, char[][] board, List<List<String>> solutions, int n) {
        // If all queens are placed, add the board configuration to solutions
        if (row == n) {
            solutions.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q'; // Place the queen
                solve(row + 1, board, solutions, n); // Recur for the next row
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    private static boolean isSafe(int row, int col, char[][] board, int n) {
        // Check the column above
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check the upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static List<String> construct(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        solveNQueens(n);

        sc.close();
    }
}