
import java.util.PriorityQueue;

public class second{
    public static int minimumcost(int arr[]){
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int num : arr){
            p.add(num);
        }
        int totalCost = 0;
        while(p.size()>1){
            int first = p.poll();
            int second = p.poll();

            int cost = first+second;
            totalCost+=cost;

            p.offer(cost); //combined rope back into the p;
        }
        return totalCost;
    }
    public static void main(String args[]){
        int arr[] = {4,3,2,6};
        System.out.println(minimumcost(arr));
    }
}