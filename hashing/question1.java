import java.util.*;
public class question1{
    public static int countDistinctElements(int[]arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<arr.length ; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main (String args[]){
        int arr[] = {1,0,0,0,0};

        int result = countDistinctElements(arr);
        System.out.println(result);


    }
}