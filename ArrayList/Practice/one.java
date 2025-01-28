
import java.util.ArrayList;
public class one{
    public static boolean monotonicArrayList(ArrayList<Integer>nums){
        for(int i=0 ; i<nums.size() ; i++){
            for(int j=i+1 ; j<nums.size() ; j++){
                if((i<=j && nums.get(i)<=nums.get(j)) || (i<=j && nums.get(i)>=nums.get(j))){
                    return true;

                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(monotonicArrayList(nums));

    }
}