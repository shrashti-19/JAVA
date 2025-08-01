public class Permutation{
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);

            reverse(nums,i+1,n-1);
        }else{
            reverse(nums, 0, n-1);
        }
        
    }
    
    public static void swap(int nums[],int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int nums[] , int start , int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public static void print(int nums[]){
        for(int i=0 ; i<nums.length ; i++){
            System.out.println(nums[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int nums[] = {1,2,3};
        nextPermutation(nums);
        print(nums);
        
    }
}