
import java.util.PriorityQueue;

public class sixth{
    static class Pair implements Comparable<Pair>{
        int value;
        int idx;

        public Pair(int value, int idx){
            this.value  = value;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2){
            //descending order
            return p2.value - this.value;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3; //window size
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int result[] = new int[arr.length-k+1];
        for(int i=0 ; i<k ; i++){
            pq.add(new Pair(arr[i], i));
        }
        //first max element 
        result[0] = pq.peek().value;
        for(int i=k ; i<arr.length ; i++){
            while(!pq.isEmpty() && pq.peek().idx<=(i-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[i],i));
            result[i-k+1] = pq.peek().value;
        }        

        //printing the result
        for(int i=0 ; i<result.length ; i++){
            System.out.println(result[i]);
        }
        
    }
}