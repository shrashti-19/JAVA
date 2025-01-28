
import java.util.ArrayList;

public class two{
    public static ArrayList lonelyNumbers(ArrayList<Integer>nums){
        ArrayList<Integer> result = new ArrayList<>();
       
        for(int i=0 ; i<nums.size() ; i++){
            int num = nums.get(i);
            int count=0;

            for(int j=0 ; j<nums.size() ; j++){
                if(nums.get(j)==num){
                    count++;
                }
            }
            if(count == 1 && !(nums.contains(num - 1) || nums.contains(num + 1))){
            result.add(num);
        }
        }
        
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(8);
        nums.add(5);
        nums.add(6);
        System.out.println(lonelyNumbers(nums));
    }
}