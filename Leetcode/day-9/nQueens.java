// public class nQueens {
//     public static boolean isSafe(char board[][], int row, int col) {
//         // Check vertically up
//         for (int i = row - 1; i >= 0; i--) {
//             if (board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         // Check left diagonal
//         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         // Check right diagonal
//         for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void printBoard(char board[][]) {
//         System.out.println("----------- Chess Board -----------");
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static boolean nQueens(char[][] board, int row) {
//         if (row == board.length) {
//             return true;
//         }

//         for (int j = 0; j < board.length; j++) {
//             if (isSafe(board, row, j)) {
//                 board[row][j] = 'Q'; // Place Queen

//                 if (nQueens(board, row + 1)) { // Recursive Call
//                     return true;
//                 }

//                 board[row][j] = 'X'; // Backtrack
//             }
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         char board[][] = new char[n][n];

//         // Initialize board with 'X'
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = 'X';
//             }
//         }

//         if (nQueens(board, 0)) {
//             System.out.println("Solution is possible:");
//             printBoard(board);
//         } else {
//             System.out.println("Solution is not possible");
//         }
//     }
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class nQueens{
    public static  List<List<String>> solveQueens(int n){
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        solveQueens(board, 0, solutions);
        return solutions;
    }
    public static void solveQueens(char[][] board, int row, List<List<String>> solutions) {
        if (row == board.length) {
            solutions.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solveQueens(board, row + 1, solutions);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (char[] chars : board) {
            path.add(new String(chars));
        }
        return path;
    }

    public static void main(String[] args) {
        int n=4;
        List<List<String>> solutions = solveQueens(n);
        System.out.println("Total solutions" + solutions.size());

        for(List<String>solution : solutions){
            for(String row: solution){
                System.out.println(row);
            }
            System.out.println();
        }
    }
}