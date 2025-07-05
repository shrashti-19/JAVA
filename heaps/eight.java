public class eight{
    public static int minPathCost(int[][] grid){
        int n= grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n][m];
        dp[0][0] = grid[0][0];
        //first fillign first row
        for(int j=1 ; j<m ; j++){
            dp[0][j] = grid[0][j] + dp[0][j-1];
        }
        //first filling first column
        for(int i=1 ; i<n ; i++){
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }

        for(int i=1 ; i<n ;i++){
            for(int j=1 ;j<m ; j++){
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[n-1][m-1];
    }
     public static void main(String[] args) {
        int[][] grid = {
            {31, 100, 65, 12, 18},
            {10, 13, 47, 157, 6},
            {100, 113, 174, 11, 33},
            {88, 124, 41, 20, 140},
            {99, 32, 111, 41, 20}
        };

        int result = minPathCost(grid);
        System.out.println("Minimum path cost: " + result);
    }
}