public class subarray{
    public static int subarraySum(int nums[],int k){
        int count=0; 
        for(int i=0 ; i<nums.length ; i++){
            int sum=0;
            for(int j=i ; j<nums.length ; j++){
                sum = sum+nums[j];
                
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3};
        int k=3;
        System.out.println("Subarray sum equals to k : "+subarraySum(nums,k));
    }
}