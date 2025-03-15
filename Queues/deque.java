import java.util.*;
public class deque{
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println("Deque so formed is :"  + dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println("Deque after removal :" + dq);
        System.out.println("First element is : "+dq.getFirst());
        System.out.println("Last element is : "+dq.getLast());

    }
}