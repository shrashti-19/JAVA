import java.util.*;
public class activity1{
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end [] = {2,4,6,7,9,9};
        int maxActivity = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        maxActivity =1;
        answer.add(0);
        int lastEnd = end[0];
        for(int i=1 ; i<end.length ; i++){
            //condition non-overlapping disjoint
            if(start[i]>= lastEnd){
                maxActivity++;
                answer.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Maximum activity a person can perform at once :" + maxActivity);

        for(int i=0 ; i<answer.size() ;i++){
            System.out.println("A" + answer.get(i)  +" ");
        }
        System.out.println();

    }
}