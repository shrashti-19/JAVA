

public class doubly{
    public static class Node{
        int data ;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
            
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        
    }

    public int removeFirst(){
        if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }else  if(size==0){
            System.out.println("Doubly Linked List is empty!");
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;

        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("List is empty");
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node prev = head;
        for(int i=0 ; i<size-2 ; i++){
            prev = prev.next;

        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void reverseLL(){
        Node current = head;
        Node prev = null;
        Node next;
        while(current!=null){
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }

        head = prev;

    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        doubly dll = new doubly();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addLast(3);
        dll.addLast(4);
        // dll.removeFirst();
        // dll.removeLast();
        dll.print();
        dll.reverseLL();
        dll.print();

    }
}