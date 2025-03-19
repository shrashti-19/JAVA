import java.util.*;
public class maxSubarray{
    public static void maxSubarray(int arr[],int k){
        //deque formed and list for storing results
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> result = new ArrayList<Integer>();

        for(int i=0 ; i<arr.length ; i++){
            if(!dq.isEmpty() && dq.peek()<i-k+1){
                dq.poll();
            }
            //remove elements from the last 
            while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
                dq.pollLast();
            }
            //add current element
            dq.offer(i);

            if(i>=k-1){
                result.add(arr[dq.peek()]);
            }
        }
        System.out.println(result);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,5,2,3,6};
        int k = 3;
        maxSubarray(arr,k);
    }
}