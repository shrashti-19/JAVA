import java.util.*;
public class dequeQueue{
    Deque<Integer> dq = new LinkedList<>();
   public void add(int data){
    dq.addLast(data);
   }
   public int remove(){
    return dq.removeFirst();
   }
   public int peek(){
    return dq.getFirst();
   }

   public boolean isEmpty(){
    return dq.isEmpty();
   }
    public static void main(String[] args) {
        dequeQueue q = new dequeQueue(); //object not jcf one ok
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            int top = q.peek();
            System.out.println(top + " ");
            q.remove();
        }
    }
}