import java.util.*;
public class queueHalfReversal{
    public static void add(Queue<Integer> q, int data){
        q.add(data);
    }
    public static void queueHalfReversal(Queue<Integer> q, int k){
        Stack<Integer> stack = new Stack<>();
        for(int i=1 ; i<=k ; i++){
            stack.push(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }

        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }


    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        add(q, 10);
        add(q, 20);
        add(q, 30);
        add(q, 40);
        add(q, 50);
        add(q, 60);
        add(q, 70);
        add(q, 80);
        add(q, 90);
        add(q, 100);
        int k = 5;
        queueHalfReversal(q, k);
        while(!q.isEmpty()){
            System.out.println(q.peek() + " ");
            q.remove();
        }
        

        
    }
}