public class nextElement{
    public static int[] greaterElement(int arr[]){
        int n  = arr.length;
        int[] result = new int[n];
        for(int i=0 ; i<n ; i++){
            result[i] = -1; // default value if no greater element is found
            for(int j=i+1 ; j<n ; j++){
                if(arr[j]>arr[i]){
                    result[i] = arr[j];
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int arr[] = {6,8,0,1,3};
        int result[] = greaterElement(arr);
        for(int i=0 ; i<result.length ; i++){
            System.out.print(result[i]+" ");
        }
        System.out.println("");
    }
}