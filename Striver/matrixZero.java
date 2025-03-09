import java.util.ArrayList;

public class matrixZero{
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int m, int n) {
        boolean firstRow = false;
        boolean firstcol = false;

        //first row
        for(int j=0 ; j<n ; j++){
            if(matrix.get(0).get(j)==0){
                firstRow = true;
                break;
            }
        }
        //first col
        for(int i=0 ; i<m ; i++){
            if(matrix.get(i).get(0)==0){
                firstcol = true;
                break;
            }
        }

        //other row and col
        for(int i=1 ; i<m ; i++){
            for(int j=1 ; j<n ; j++){
                if(matrix.get(i).get(j)==0){
                    matrix.get(0).set(j, 0);
                    matrix.get(i).set(0,0);
                }
            }
        }

        for(int i=1 ; i<m ; i++){
            for(int j=1 ; j<n ; j++){
                if(matrix.get(i).get(0)==0 || matrix.get(0).get(j)==0){
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        matrix.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(0);
        row2.add(6);
        matrix.add(row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        matrix.add(row3);

        int m = 3;
        int n = 3;

        ArrayList<ArrayList<Integer>> result = zeroMatrix(matrix, m, n);

        for (ArrayList<Integer> row : result) {
            for (Integer val : row) {
            System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}