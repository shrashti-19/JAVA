import java.util.*;

public class jobSequencing{
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
           id = i;
           deadline = d;
           profit = p;

        }
    }
    public static void main(String args[]){
        int jobsInfo[][] = {
            {4,20},
            {1,10},
            {1,40},
            {1,30}
        };

        //we will create a arrayList of jobs
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0 ; i<jobsInfo.length  ; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        //sorting on the basic of profit
        Collections.sort(jobs, (a,b)-> b.profit - a.profit); //this will give in ascending order we want in desceding order

        ArrayList<Integer> ans = new ArrayList<>();
        int time = 0;
        int profit = 0;
        for(int i=0 ; i<jobs.size() ; i++){
           Job curr = jobs.get(i);
           if(curr.deadline > time){
             ans.add(curr.id);
             time++;
             profit+=curr.profit;
           }
        }
        System.out.println("Maximum profit is  : " + profit);
        System.out.println("Maximum jobs with maximum profit : ");
        for(int i =0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i) +  " ");
        }
        System.out.println();
    }
}