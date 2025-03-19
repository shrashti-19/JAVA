public class rotate{
    public static void rotate(int arr[][]){
        //transpose of the array upper triangluar elements
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse each element of the row
        for(int i=0 ; i<arr.length ;i++){
            for(int j=0 ; j<arr.length/2 ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]  = temp;
            }
        }
        
    }
    public static void print(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                System.out.println(arr[i][j] + "");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        print(arr);
    }
}