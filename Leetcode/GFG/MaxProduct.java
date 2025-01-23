public class MaxProduct{
   
    public static int MaxProd(int nums[]){
        int minP = nums[0];
        int maxP = nums[0];
        int result = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]<0){
                int temp = maxP;
                maxP=minP;
                minP=temp;

            }
            maxP = Math.max(nums[i],maxP*nums[i]);
            minP = Math.min(nums[i],minP*nums[i]);
            result = Math.max(result,maxP);
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={-2,6,-3,-10,0,2};
        System.out.println(MaxProd(nums));
    }
}