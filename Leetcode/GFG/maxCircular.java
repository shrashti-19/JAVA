public class maxCircular{
    public static int kadens(int arr[]){
        int sum=arr[0];
        int max=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            sum = Math.max(arr[i], sum+arr[i]);
            max = Math.max(max,sum);
        }
        return max;
    }
    public static int maxCircularSubarray(int arr[]){
        int nonCircularSum = kadens(arr);

        int totalSum =0;
        for(int i=0 ; i<arr.length ;i++){
            totalSum+=arr[i];
        }

        int invertedArray [] = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            invertedArray[i] = -arr[i];

        }  

        int minimumSubArray = kadens(invertedArray);
        System.out.println("minimum array sum " + minimumSubArray);
        int cirucularArray = totalSum + minimumSubArray;
        if(cirucularArray ==0){
            return nonCircularSum;
        }

        return Math.max(cirucularArray,nonCircularSum);
     }
    public static void main(String[] args) {
        int arr[] = {8,-8,9,-9,10,-11,12};
        System.out.println(maxCircularSubarray(arr));
    }
}