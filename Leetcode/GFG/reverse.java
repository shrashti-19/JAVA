public class reverse{
    public static void reverseOfanArray(int []arr){
        int lp=0;
        int rp=arr.length-1;
        while(lp<=rp){
            int temp=arr[lp];
            arr[lp]=arr[rp];
            arr[rp]=temp;
            lp++;
            rp--;
        }
    }
    public static void print(int []arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,4,3,2,6,5};
        reverseOfanArray(arr);
        print(arr);
    }
}