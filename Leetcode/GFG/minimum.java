
import java.util.Arrays;

public class minimum{
    public static int minimumHeightDifference(int []arr,int k){
        int n= arr.length;
        if(n==1) return 0;

        Arrays.sort(arr);
        int diff = arr[n-1] - arr[0];
        for(int i=1 ; i<n ; i++){
            int max = Math.max(arr[n-1]-k , arr[i-1]+k);
            int min = Math.min(arr[0]+k,arr[i]-k);
            if(min<0) continue;

            diff = Math.min(diff,max-min);
        }
        return diff;
        
    }
    public static void main(String[] args){
        int arr[] = {1,8,10,6,4,6,9,1};
        int k=7;
        System.out.println(minimumHeightDifference(arr,k));
    }
}