
import java.util.PriorityQueue;

public class four{
    public static void main(String[] args) {
        int ropes[] = {5,3,3,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0 ; i<ropes.length ; i++){
            pq.add(ropes[i]);
        }
        // System.out.println("print the priority queue" + pq); -> output -> [3,3,5,6]
        // we have to get the two minimum ropes from the priority queue it will be stored in first two index 0 and 1
        int cost = 0;
        while(pq.size()>1){
            int min1 = pq.remove(); //3
            int min2 = pq.remove(); //3
            cost+=min1+ min2; //6
            //again add the sum to the pq
            pq.add(min1+min2);
        }
        System.out.println("Minimum cost to combine all the ropes is "+ cost);
    }
}