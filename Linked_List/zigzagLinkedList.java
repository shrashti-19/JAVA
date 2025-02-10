

public class zigzagLinkedList{
    public static class Node{
        int  data;
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
     
        if(head == null){
            head=tail = newNode;
            return;
        }
        newNode.next = head;
        head =  newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        
        if(head ==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
     public void ll(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
    
        }
        System.out.println("null");
        
    }
    public static void zigzag(){
        //find the mid node
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node secondHalf = mid.next;
        mid.next = null; //divided into 2 equal halves

        //reversing the 2nd half
        Node current = secondHalf;
        Node prev = null;
        Node next;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        //merging zigzag
        Node left = head;
        Node right = prev;
        Node nextL,nextR;
        while(left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
     public static void main(String[] args){
       zigzagLinkedList list = new zigzagLinkedList();
       list.addFirst(1);
       list.addLast(2);
       list.addFirst(3);
       list.addLast(4);
       list.addFirst(5);
       list.addLast(6);
       list.ll();
       zigzag();
       list.ll();

     }
}