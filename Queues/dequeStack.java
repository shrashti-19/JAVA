import java.util.*;

public class dequeStack{
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);
        while(!stack.isEmpty()){
            int peek = stack.removeLast();
            System.out.println(peek +  " ");
        }

    }
}