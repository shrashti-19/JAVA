public class kadens{
    public static int maxsubArraySum(int []nums){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            sum = sum+nums[i];
            maxSum = Math.max(maxSum, sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[]={-2,-4};
        System.out.println(maxsubArraySum(nums));
        
    }
}