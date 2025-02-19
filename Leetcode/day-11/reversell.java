
public class reversell{
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
    public static Node reverseList(Node head){

    
        Node current = head;
        Node prev = null;
        Node next;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void printReverseList(Node head){
       Node temp = head;
       while(temp!=null){
        System.out.print(temp.data + "->");
        temp = temp.next;
       }
       System.out.println("null");
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
      

        head = reverseList(head);
        printReverseList(head);

    }
}