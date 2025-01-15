public class zeroes{
    public static void zeroesTotheEnd(int[] arr) {
        // code here
        int pos=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]!=0){
                arr[pos]=arr[i];
                pos++;
            }else{
                //element is non zero
            }
        }
         while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }
        
    }
    public static void print(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,4,3,0,5,0};
        zeroesTotheEnd(arr);
        print(arr);
    }
}