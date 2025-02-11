public class searchRotated{
  
    public static int rotatedSorted(int[] nums, int target) {
        int left = 0;
        int n = nums.length;
        int right = n-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }

            //checking the left part if sorted and it lies in that range or not
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                //right part
                if(nums[mid]<=nums[right]){
                    if(nums[mid]<target && target<=nums[right]){
                        left=mid+1;
                    }else{
                        right = mid-1;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target  = 0;
        System.out.println(rotatedSorted(nums,target));
    }
}