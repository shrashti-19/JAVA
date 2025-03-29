
import java.util.*;

public class Stack{
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public Stack(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public boolean empty(){
        return q1.isEmpty();
    }
    public void push(int data){
        q1.add(data);
    }
    public int top(){
        if(q1.isEmpty()){
        return -1;  
    }
    
    while(q1.size() > 1){
        q2.add(q1.poll());
    }
    
    
    int topElement = q1.peek();
    
    q2.add(q1.poll());
    Queue<Integer> temp = q1;
    q1 = q2;
    q2 = temp;
    
    return topElement;
    }
    public int pop(){
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size()>1){
            q2.add(q1.poll()); // added 1 to the q2
        }
        int topElement = q1.peek(); // 2 
        q1.poll();//2
        Queue<Integer> temp = q1;
        q1=q2;
        temp=q2;
        return topElement;
    }
    public static void main(String args[]){
        Stack myStack = new Stack();
        
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
}