
public class mergeLL{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head1;
    public static Node head2;
    public static Node mergedLinkedList(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node current = dummy;

        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                current.next = head1;
                head1 = head1.next;
            }else{
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if(head1!=null) current.next = head1;
        if(head2!=null) current.next = head2;

        return dummy.next;
    }

    public static void printList(Node head){
        while(head!=null){
            System.out.println(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

        public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);
        head1.next.next.next = null;

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);
        head2.next.next.next = null;

        Node result = mergedLinkedList(head1,head2);
        printList(result);


    }
}