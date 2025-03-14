public class sort{
    public static void sort(int arr[]){
        int current = 0;
        int zeroPos = 0;
        int twoPos = arr.length-1;
        while(current<=twoPos){
            if(arr[current]==0){
                //swap current and zeropos
                // increment current and zerpos
                int temp = arr[current];
                arr[current] = arr[zeroPos];
                arr[zeroPos] = temp;
                zeroPos++;
                current++;
            }else if (arr[current]==1){
                current++;
            }else{
                //current element is pointing at 2
                //swap current and two pos 
                //decrement two pos only
                //not incrementing current because we don't know what is store in previous current
                int temp = arr[current];
                arr[current] = arr[twoPos];
                arr[twoPos] = temp;
                twoPos--;
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0  ;i<arr.length  ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String args[]){
        int arr[] = {0,1,2,1,2,1,2};
        sort(arr);
        print(arr);
    }
}