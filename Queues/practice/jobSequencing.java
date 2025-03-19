
import java.util.Arrays;

class Job{
    int id, deadline, profit;
    //constructor called
    Job(int id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
public class jobSequencing{
    public static int[] job(Job[] jobs,int n){
        //sorting in descending order on the basis of profit
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);

        //max deadline
        int maxDeadline = 0;
        for(Job job : jobs){
            maxDeadline = Math.max(maxDeadline,job.deadline);
        }

        //initialize slot array
        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);

        //assign jobs to the slot
        int jobCount = 0;
        int totalProfit = 0;
        for(Job job : jobs){
            for(int j= job.deadline ; j>0 ; j--){
                if(slot[j]==-1){
                    slot[j] =job.id;
                    jobCount++;
                    totalProfit+=job.profit;
                    break;
                }
            }
        }
        return new int[]{jobCount, totalProfit};

    }

    public static void main(String[] args) {
        Job jobs[] = {
            new Job(1, 2, 100),
            new Job(2,1,50),
            new Job(3,2,10),
            new Job(4,1,20),
            new Job(5,3,30)
        };
        int result [] = job(jobs,jobs.length);
        System.out.println("Number of jobs done: " + result[0]);
        System.out.println("Total profit: " + result[1]);
        

    }
}