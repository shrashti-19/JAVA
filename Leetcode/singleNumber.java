public class singleNumber{
    public static int singleNum(int nums[]){
        int result=0;
        for(int num : nums){
            result = result ^num;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1};
        System.out.println(singleNum(nums));
    }
}