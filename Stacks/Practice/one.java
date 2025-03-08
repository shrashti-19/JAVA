
import java.util.Stack;

public class one{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static boolean Palindrome(Node head){
        Node slow = head;
        boolean isPalindrome = false;
        Stack<Integer> s = new Stack<>();
        while(slow!=null){
            s.push(slow.data);
            slow = slow.next;
        }
        while(head!=null){
            int i = s.pop();
            if(head.data == i){
                isPalindrome = true;
            }
            head = head.next;
        }
        return isPalindrome;
    }
     public static void main(String[] args){

        Node one = new Node('A');
        Node two = new Node('B');
        Node three = new Node('C');
        Node four = new Node('B');
        Node five = new Node('A');

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next =null;

        head = one;

        System.out.println(Palindrome(head)); 
     }
}