
import java.util.ArrayList;
import java.util.Arrays;

public class mergeIntervals{
    public static int[][] mergeInterval(int intervals[][]){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));//sorting on the  basis of starting interval

        ArrayList<int[]> mergedList = new ArrayList<>();
        for(int[] interval : intervals){
        if(mergedList.isEmpty() || mergedList.get(mergedList.size()-1)[1]<interval[0]){
            mergedList.add(interval);
          }else{
            //overlapping exist
            mergedList.get(mergedList.size()-1)[1] = Math.max(mergedList.get(mergedList.size()-1)[1], interval[1]);
          }
        }
        return mergedList.toArray(new int[mergedList.size()][]);
    }
    public static void main(String[] args) {
        int intervals [][] = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(mergeInterval(intervals)));

    }
}