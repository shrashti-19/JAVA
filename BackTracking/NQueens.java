public class NQueens{
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up direction 
        for(int i = row-1 ; i>=0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //LD
        for(int i=row-1 , j=col-1 ; i>=0 && j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }


        //RD

        for(int i=row-1, j =col+1 ; i>=0 && j<board.length ; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }


        return true;
    }
    static int count =0;
    public static boolean nQueens(char board[][],int row){
        if(row==board.length){
            ///printBoard(board);
            count++;
            return true;

        }
        //column loop
        for(int j=0 ; j<board.length ; j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            if(nQueens(board, row+1)){
                return true;
            }
            board[row][j]='X';//backtrack krke aaye
            }
        }
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("-----------chessBoard------------");
        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board.length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     //n queens n rows
     int n=4;
     char board[][]=new char[n][n];
     for(int i=0 ; i<n ; i++){
        for(int j=0 ; j<n ; j++){
            board[i][j]='X';
        }
     }
     if(nQueens(board,0)){
        System.out.println("solution is possible");
        printBoard(board);
     }else{
        System.out.println("solution is not possible");
     }
     // System.out.println("total ways to solve n queens " + count);
    }
}