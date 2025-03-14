
import java.util.LinkedList;
import java.util.Queue;

public class interleaf{
    public static void interleafQueues(Queue<Integer> q){
        //new queue with the first name having size half of the original queue
        int n = q.size();
        Queue<Integer> first = new LinkedList<>();
        for(int i=0 ; i<n/2 ; i++){
            first.add(q.remove());
        }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
    }
  public static void main(String[] args){
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    q.add(9);
    q.add(10);
    q.add(11);
    q.add(12);
    interleafQueues(q);
    while(!q.isEmpty()){
        System.out.println(q.remove() + " ");
    }
    System.out.println(" ");
  }
}