public class array{
    public static void changeArray(int arr[],int index,int value){
       //base case
       if(index==arr.length){
        print(arr);
        return;
       }
       //kaam - recursion

       arr[index]=value;
       changeArray(arr, index+1, value+1);
       arr[index]=arr[index]-2;
    }
    public static void print(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArray(arr, 0, 1);
        print(arr);
    }
}