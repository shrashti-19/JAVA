import java.util.*;
public class merge{
    public static List<List<Integer>> mergedIntervals(int arr[][]){
        List<List<Integer>> result = new ArrayList<>();
        int start = arr[0][0];
        int end = arr[0][1];
        Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
        for(int i=1; i<arr.length;i++){
            if(end<=arr[i][0]){
                end = Math.max(end, arr[i][1]);
            }else{
                result.add(Arrays.asList(start,end));
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        result.add(Arrays.asList(start,end));
        return result;

    }
    public static void main(String args[]){
        int arr[][] = {{1,3},
        {2,4},
        {3,5},
        {6,7}
        };
        System.out.println(mergedIntervals(arr));
    }
}