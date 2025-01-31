

public class Last{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = null;
            return;
        }
        head.next = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){ //tail null also 
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void main(String[] args){
        Last list = new Last();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
    }
}