public class Kadens{
    public static int kadens(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i ++){
            sum = sum +arr[i];
            if(sum<0){
                sum=0;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {18,-6,-6,-5,7,10,16,-6,-2,0};
        System.out.println(kadens(arr));
    }
}