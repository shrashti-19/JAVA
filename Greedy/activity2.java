import java.util.*;
public class activity2{
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end [] = {2,4,6,7,9,9};
        int maxActivity = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        //case :2 if end timings are not given as sorted then we will use comparator
        // we will declare an 2-D array of activities with 3 columsn - index,start time and end time
        int activities[][] = new int [start.length][3];
        for(int i=0 ; i<start.length ; i++){
            activities[i][0] = i;
            activities[i][1]= start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));
        
        //end timings are sorted now

        maxActivity = 1;
        answer.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=0 ; i<end.length ; i++){
            if(activities[i][1]>= lastEnd){
                maxActivity++;
                answer.add(activities[i][0]);
                lastEnd = activities[i][2];

            }
        }
        System.out.println("Maximum activity :"+ maxActivity);

        for(int i=0 ; i<answer.size() ; i++){
            System.out.println("A" + answer.get(i) + " ");
        }
        System.out.println();

    }
}