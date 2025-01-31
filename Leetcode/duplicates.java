
import java.util.Arrays;

public class duplicates{
    public static int findDuplicates(int nums[]){
       
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {3,1,3,4,2};
        System.out.println(findDuplicates(nums));
    }
}