
import java.util.Arrays;

public class minAbsoluteDiffernce{
    public static void main(String args[]){
        int  a[] = {1,2,3};
        int b[] = {2,1,3};
        //same length and two arrays
        Arrays.sort(a);
        Arrays.sort(b);
        int minDifference =0;
        for(int i=0 ; i<a.length ; i++){
            int difference = Math.abs(a[i]-b[i]);
            minDifference+=difference;
        }
        System.out.println("Minimum absolute difference using greedy approach is "+minDifference);
    }
}