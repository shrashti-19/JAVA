public class problem7{
    public static int firstOccurrence(int []arr,int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurrence(arr, key, i+1);
    }
    public static int lastOccurrence(int arr[],int key,int i){
        if(i==arr.length){
            return-1;
        }
        int isFound = lastOccurrence(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;

    }
    public static void main(String[] args) {
        int []arr = {5,5,5,5};
        //System.out.println(firstOccurrence(arr, 5, 0));
        System.out.println(lastOccurrence(arr, 5, 0));
    }
}