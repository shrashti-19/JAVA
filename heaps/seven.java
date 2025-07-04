
import java.util.Comparator;
import java.util.PriorityQueue;

public class seven{
    static class SlotTime{
        int time;
        int slot;

        public SlotTime(int time, int slot){
            this.time = time;
            this.slot = slot;
        }
    }
    public static void main(String args[]){
        int arr[] = {2,6};
        int k=2;
        int N=6;
        int INF = Integer.MAX_VALUE;

        int[] timeTofill = new int[N+1];

        for(int i=1 ; i<=N;  i++){
            timeTofill[i] =INF;
        }
        //already initialized slots to 0
        for(int slot: arr){
            timeTofill[slot] = 0;
        }

        PriorityQueue<SlotTime> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.time));
        for(int slot: arr){
            pq.offer(new SlotTime(0,slot));
        }

        while(!pq.isEmpty()){
            SlotTime current = pq.poll();
            int currtime = current.time;
            int currslot = current.slot;

            int left = currslot-1;
            if(left>=1 && currtime+1<timeTofill[left]){
                timeTofill[left] =currtime+1;
                pq.offer(new SlotTime(currtime+1,left));
            }

            int right = currslot+1;
            if(right<=N && currtime+1<timeTofill[right]){
                timeTofill[right] = currtime+1;
                pq.offer(new SlotTime(currtime+1, right));
            }
        }
        
        int maxTime = 0;
        for(int i=1 ; i<=N ; i++){
            maxTime = Math.max(maxTime, timeTofill[i]);
        }

        System.out.println("Minimum time to fill all slots  " + maxTime);
        
    }
}