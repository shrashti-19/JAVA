public class Search2D{
    public static boolean search(int matrix[][],int target){
        int sr=0;
        int sc=0;
        int er=matrix.length-1;
        int ec = matrix[0].length-1;

        while(sr<=er && sc<=ec){
            int current = matrix[sr][ec];
            if(current == target){
                return true;
            }
            else if(current>target){
                ec--;
            }
            else{
                sr++;
            }

        }

        return false;

        
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=0;
        boolean result = search(matrix,target);
        System.out.println(result);
    }
}