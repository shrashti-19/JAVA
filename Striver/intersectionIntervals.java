
import java.util.ArrayList;
import java.util.Arrays;

public class intersectionIntervals{
    public static ArrayList<ArrayList<Integer>> intersectionInterval(ArrayList<ArrayList<Integer>> interval1,ArrayList<ArrayList<Integer>> interval2){

        int n1 = interval1.size();
        int n2 = interval2.size();
        int i=0,j=0;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while(i<n1 && j<n2){
            int start1 = interval1.get(i).get(0),end1 = interval1.get(i).get(1);
            int start2 = interval2.get(j).get(0),end2 = interval2.get(j).get(1);
            if(start1<=end2 && start2<=end1){
                int newStart = Math.max(start1, start2);
                int newEnd = Math.min(end1,end2);
                result.add(new ArrayList<>(Arrays.asList(newStart,newEnd)));        
            }

            if(end1<end2){
                i++;
            }else{
                j++;
            }
        }
        return result;

    }
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> interval1 = new ArrayList<>();
        interval1.add(new ArrayList<>(Arrays.asList(1, 3)));
        interval1.add(new ArrayList<>(Arrays.asList(2, 4)));
        interval1.add(new ArrayList<>(Arrays.asList(4, 6)));

        ArrayList<ArrayList<Integer>> interval2 = new ArrayList<>();
        interval2.add(new ArrayList<>(Arrays.asList(1, 9)));
        interval2.add(new ArrayList<>(Arrays.asList(4, 9)));
        interval2.add(new ArrayList<>(Arrays.asList(3, 8)));

        System.out.println(intersectionInterval(interval1, interval2));
        

    }
}