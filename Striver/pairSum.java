import java.util.*;
public class pairSum{
    public static List<int[]> pairSum(int arr[],int target){
        List<int[]> answer = new ArrayList<>();
        int lp = 0;
        int rp = arr.length-1;
        Arrays.sort(arr);
        while(lp<rp){
            int sum = arr[rp]+arr[lp];
            if(sum==target){
                answer.add(new int[]{arr[lp],arr[rp]});
                int leftval = arr[lp], rightval = arr[rp];
                while(lp<rp && arr[lp] == leftval) lp++;
                while(lp<rp && arr[rp] == rightval) rp--;
            }else if(sum>target){
                rp--;
            }else{
                lp++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int arr[] = {2,-3,3,3,-2};
        int target = 0;
        List<int[]> result = pairSum(arr, target);
         for (int[] pair : result) {
            System.out.println(Arrays.toString(pair));
        }
    }
}