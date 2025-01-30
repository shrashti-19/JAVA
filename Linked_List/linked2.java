

public class linked2{
    public class Node{
        int data;
        Node next;

        public Node(int data){ //constructor
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //check if ll is empty
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        // rest steps 
        newNode.next = head;
        head = newNode;
        

    }

    
    public static void main(String[] args) {
        
        linked2 list = new linked2();
        list.addFirst(1);
        list.addFirst(2); 
        
        
    }
}