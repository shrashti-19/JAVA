
public class search{
    public static boolean binarySearch(int row[],int target){
        int left=0;
        int right=row.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(row[mid]==target){
                return true;
            }else if(row[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
        return false;
    }
    public static boolean searchmatrix(int matrix[][],int target){
        for(int i=0 ; i<matrix.length ; i++){
            if(binarySearch(matrix[i],target)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,6},{10,11,16,20},{23,30,34,60}};
        int target=20;
        System.out.println(searchmatrix(matrix,target));
    }
}