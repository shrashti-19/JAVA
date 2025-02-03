
import java.util.ArrayList;

public class inversions{
    
    // public static long countInversions(ArrayList<Integer>arr){
    //     int inversions=0;
    //     for(int i=0 ; i<arr.size() ; i++){
    //         for(int j=i+1 ; j<arr.size() ; j++){
    //             if(arr.get(i)>arr.get(j)){
    //                 inversions++;
                 

    //             }
    //         }
    //     }
    //     return inversions;
    public static long mergeAndCount(ArrayList<Integer> arr,int left,int mid,int right){
        ArrayList<Integer> leftArr = new ArrayList<>(arr.subList(left, mid + 1));
        ArrayList<Integer> rightArr = new ArrayList<>(arr.subList(mid + 1, right + 1));

        int i=0,j=0,k=left;
        long inversions=0;

        while(i<leftArr.size() && j<rightArr.size()){
            if(leftArr.get(i)<=rightArr.get(j)){
                arr.set(k++, leftArr.get(i++));
            }else{
                arr.set(k++, rightArr.get(j++));
                inversions+=(mid+1)-(left+i);
            }
        }
            while(i<leftArr.size()){
                arr.set(k++, leftArr.get(i++));
            }

            while(j<rightArr.size()){
                arr.set(k++,rightArr.get(j++));
            }

        return  inversions;
        
    }
    public static long mergeSortAndCount(ArrayList<Integer> arr,int left,int right ){
        if(left>=right) return 0;

        int mid = (left+right)/2;
        long inversions =0;

        inversions+=mergeSortAndCount(arr, left, mid);
        inversions+=mergeSortAndCount(arr, mid+1, right);

        inversions+=mergeAndCount(arr, left, mid,right);

        return inversions;
    }
    public static long countInversions(ArrayList<Integer>arr){
        return mergeSortAndCount(arr, 0 ,arr.size()-1);
    }
    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(2);
       arr.add(4);
       arr.add(1);

       long result = countInversions(arr);
       System.out.println(result);
       
       

    }
}