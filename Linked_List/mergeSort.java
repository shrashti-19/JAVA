public class mergeSort{
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
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //midnode
    }

    private Node merge(Node head1,Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1!=null &&   head2!=null){
            if(head1.data <=head2.data){
                temp.next = head1;
                head1 = head1.next;
                
            }else{
                //rightHead value is smaller
                temp.next = head2;
                head2 = head2.next;
               
            }
            temp = temp.next;
        }
        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }
        return mergeLL.next;
    }
    
    public  Node mergeSort(Node head){
        if(head == null || head.next==null){
            return head;
        }
        //find the mid node
        Node mid = getMid(head);
        //dividing into two equal halves
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head); //it will give the sorted left Linked List
        Node newRight = mergeSort(rightHead); //it will give the sorted right linked list

        return merge(newLeft,newRight);

    }
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
    public static void main(String[] args) {
        mergeSort ll = new mergeSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.ll();
        ll.head = ll.mergeSort(ll.head);
        ll.ll();
    }
}