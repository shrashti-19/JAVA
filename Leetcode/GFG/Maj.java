import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maj{
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
          List<Integer> result = new ArrayList<>();
        //base case 
        
        int n=nums.length;
        if(n==0){
            return result;
        }
      
        int count1=0;
        int count2=0;
        int candidate1 = Integer.MIN_VALUE;
        int candidate2 = Integer.MIN_VALUE;
        
        for(int num : nums){
            if(num == candidate1){
                count1++;
            }
            else if(num == candidate2){
                count2++;
            }
            else if(count1==0){
                candidate1=num;
                count1=1;
            }
            else if (count2==0){
                candidate2=num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        //verify 
        
        count1=0;
        count2=0;
        for(int num : nums){
            if(num==candidate1){
                count1++;
            }
            else if(num==candidate2){
                count2++;
            }
        }
        
        if(count1>n/3){
           result.add(candidate1);
        }
        if(count2>n/3){
            result.add(candidate2);
        }
        
        Collections.sort(result);
        
        return result;
    
        
    }
    public static void main(String[] args) {
         int[] nums = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        Maj maj = new Maj();
        // Call the findMajority method
        List<Integer> result = maj.findMajority(nums);
        
        // Print the result
        System.out.println(result);
    }
}
