
import java.util.LinkedList;

public class Collections{
    public static void main(String[] args) {
        //objects use char , integer class not primitive
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
        
    }
}