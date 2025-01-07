public class majorityElement{
    public static int majorityElementfind(int nums[]){
        if(nums.length ==0 ){
            return 0;
        }
        int start = nums[0];
        int count=1;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == start){
                count++;
            }
            else{
                count--;
                if(count == 0){
                    start = nums[i];
                    count=1;
                }
            }
        }
        //verify
        count=0;
        for(int i=0 ; i<nums.length ; i++){
            if(start == nums[i]){
                count++;
            }
        }
        if(count > nums.length/2){
            return start;
        }
        else return -1;
       
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,1,2,3,3};
        System.out.println(majorityElementfind(nums));
    }
}