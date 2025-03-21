import java.util.*;
public class pairSum{
    public static List<int[]> pairSum(int arr[],int target){
        List<int[]> answer = new ArrayList<>();
        int lp = 0;
        int rp = arr.length-1;
        while(lp<rp){
            int sum = arr[rp]+arr[lp];
            if(sum==target){
                answer.add(new int[]{arr[lp],arr[rp]});
                lp++;
                rp--;
            }else if(sum>target){
                rp--;
            }else{
                lp++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 5;
        List<int[]> result = pairSum(arr, target);
         for (int[] pair : result) {
            System.out.println(Arrays.toString(pair));
        }
    }
}