
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foursum{
 public List<List<Integer>> fourSum(int[] nums, int target){
    //fixing the first element 
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0 ; i<nums.length-3 ; i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }

        //fixing the second element 
        for(int mid = i+1 ; mid<nums.length-2 ; mid++){
            if(mid>0 && nums[mid]==nums[mid-1]) continue;

            int left = mid+1;
            int right = nums.length-1;

            while(left<right){
                long sum = (long)nums[i]+nums[mid]+nums[left]+nums[right];

                if(sum==target){
                    result.add(Arrays.asList(nums[i], nums[mid],nums[left], nums[right]));
                
                   while(left<right && nums[left]==nums[left+1]){
                    left++;
                   }

                   while(left<right && nums[right]==nums[right-1]){
                    right--;
                   }

                   left++;
                   right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }

            }
        }
    }
    return result;

 }
 public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        Foursum sumInstance = new Foursum();
        int target=0;
        List<List<Integer>> result = sumInstance.fourSum(nums,target);

        // Print the result
        System.out.println("Quadruplets that sum up to zero:");
        for (List<Integer> four : result) {
            System.out.println(four);
        }

    }
 }