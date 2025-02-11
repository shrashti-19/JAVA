public class second{
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void print(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public void deleteMNodes(int M,int N){
        Node temp = head;
    
    while (temp != null) {
        // Skip M nodes
        for (int i = 1; i < M && temp != null; i++) {
            temp = temp.next;
        }
        
        // If end of list reached, break
        if (temp == null) break;

        // Start deleting next N nodes
        Node current = temp.next;
        for (int i = 0; i < N && current != null; i++) {
            current = current.next;
        }

        // Connect the retained part to the remaining list
        temp.next = current;
        temp = current; // Move to the next M nodes
    }

    }
    public static void main(String[] args){
        second ll = new second();
        head = new Node(1);
        Node newNode = new Node(2);
        head.next = newNode;
        newNode = new Node(3);
        head.next.next = newNode;
        newNode = new Node(4);
        head.next.next.next = newNode;
        newNode = new Node(5);
        head.next.next.next.next = newNode;
        newNode = new Node(6);
        head.next.next.next.next.next = newNode;
        head.next.next.next.next.next.next = null;
        int M=2,N=2;
        ll.deleteMNodes(M,N);
        ll.print();
    }
}