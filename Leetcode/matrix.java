public class matrix{
    public static void matrixSetZero(int matrix[][]){
        boolean firstRow = false;
        boolean firstColumn = false;
        //checking if anyone in firstrow is zero
        for(int j=0 ; j<matrix[0].length  ; j++){
            if(matrix[0][j]==0){
                firstRow = true;
                break;
            }
        }

        //checking if anyone in firstColumn is zero

        for(int i=0 ; i<matrix.length ; i++){
            if(matrix[i][0]==0){
                firstColumn = true;
                break;
            }
        }

        // traversing rest 
        for(int i=1 ; i<matrix.length ; i++){
            for(int j=1 ; j<matrix[i].length ; j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(int i=1 ; i<matrix.length ; i++){
            for(int j=1 ; j<matrix[i].length ; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }

        //set the firstrow zero if needed
        if(firstRow){
            for(int j=0 ; j<matrix[0].length ; j++){
                matrix[0][j]=0;
            }
        }

        if(firstColumn){
            for(int i=0 ; i<matrix.length ; i++){
                matrix[i][0] =0;
            }
        }
    }
    public static void print(int matrix[][]){
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        matrixSetZero(matrix);
        print(matrix);
    }
}