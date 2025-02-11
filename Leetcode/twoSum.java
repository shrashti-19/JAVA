
import java.util.ArrayList;

public class twoSum{
    public static ArrayList<Integer> twosum(int nums[],int target){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i]+nums[j]==target){
                    result.add(i);
                    result.add(j);
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        int nums[] = {2,7,11,15};
        int target = 9;
        System.out.println(twosum(nums,target));
    }
}