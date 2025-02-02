
import java.util.ArrayList;

public class spiralMatrix{
    public static ArrayList<Integer>spiralOrder(int matrix[][]){
       ArrayList<Integer> result = new ArrayList<>();
       if(matrix==null || matrix.length==0) return result;
        
        int sr=0;
        int sc=0;
        int endRow = matrix.length-1;
        int endColumn = matrix[0].length-1;

        
        while(sr<=endRow && sc<=endColumn){
            //top boundary
            for(int j=sc ; j<=endColumn ; j++){
                result.add(matrix[sr][j]);
            }
            sr++;
            if(sr>endRow) break;
            //right boundary
            for(int i = sr ; i<=endRow ; i++){
                result.add(matrix[i][endColumn]);
            }
            endColumn--;
            if(sc>endColumn) break;

            //bottom boundary
            for(int j=endColumn ; j>=sc ; j--){
                result.add(matrix[endRow][j]);
            }
            endRow--;
            if(sr>endRow) break;

            //left boundary
            for(int i = endRow; i >= sr; i--){
                result.add(matrix[i][sc]);
            }
            
            sc++;
            
        }

        return result;



    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        ArrayList<Integer> result = spiralOrder(matrix);
        System.out.println(result);

        
    }
}