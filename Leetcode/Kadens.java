public class Kadens{
    public static int kadensalgo(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0 ; i<arr.length ; i++){
            sum = sum+arr[i];
            maxSum = Math.max(maxSum,sum);
            if(maxSum<0){
                maxSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int []nums = {5,4,-1,7,8};
        System.out.println(kadensalgo(nums));
    }
}