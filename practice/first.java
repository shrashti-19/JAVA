public class first{
    public static int allOccurrences(int []arr,int key,int index){
        //base case
        
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==key){
            System.out.println(index+" ");
        }
        return allOccurrences(arr, key, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key=2;
        int index=0;
        allOccurrences(arr,key,index);
        System.err.println();
    }
}