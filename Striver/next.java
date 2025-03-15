public class next{
    public static void nextPermutation(int arr[]){
        //breakpoint find
        int index = -1;
        for(int i =arr.length-2  ; i>=0 ; i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            //reverse the whole array
            reverse(arr, 0, arr.length - 1);
            return;
        } 

        //next possible greater element 
        //left remains same 
        //right half and breakpoint modification
        for(int i=arr.length-1  ; i>index ; i--){
            if(arr[i]>arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                //swapping done
                break;
            }
        }
        //reverse the right half
        reverse(arr,index+1,arr.length-1);
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void print(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] +  " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1};
        nextPermutation(arr);
        print(arr);
    }
}