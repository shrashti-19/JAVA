public class maze {
    

    public static void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean mazeSolve(int maze[][]) {
        int n = maze.length;
        int sol[][] = new int[n][n];

        // If there's no solution
        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.println("Solution doesn't exist");
            return false;
        }

        printSolution(sol); // Print the solution if it exists
        return true;
    }

    public static boolean isSafe(int maze[][], int x, int y) {
        // Check if the cell is within bounds and not blocked
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        int n = maze.length;

        // Base case: If destination is reached
        if (x == n - 1 && y == n - 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is a valid cell to visit
        if (isSafe(maze, x, y)) {
            sol[x][y] = 1; // Mark the cell as part of the solution

            // Move Down
            if (solveMazeUtil(maze, x + 1, y, sol)) {
                return true;
            }

            // Move Right
            if (solveMazeUtil(maze, x, y + 1, sol)) {
                return true;
            }

            // Backtracking: Unmark the cell
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void main(String[] args) {
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        mazeSolve(maze);
    }
}
