public class fourth{
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
    public void evenOdd(){
        Node evenhead = null,eventail=null;
        Node oddhead = null, oddtail = null;
        Node temp = head;
        while(temp!=null){
            if(temp.data%2==0){
                if(evenhead==null){
                    evenhead=eventail=temp;
                }else{
                    eventail.next  = temp;
                    eventail = temp;
                }
            }else{
                if(oddhead==null){
                    oddhead = oddtail=temp;
                }else{
                    if (oddtail != null) {
                        oddtail.next = temp;
                    }
                    oddtail = temp;
                }

            }
            temp=temp.next;
        }
        //merging of odd and even list
        if (eventail != null) {
            eventail.next = oddhead;
        }
        if (oddtail != null) {
            oddtail.next = null;
        }

        head = (evenhead!=null) ? evenhead:oddhead;
    }
     public void print(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        fourth ll = new fourth();
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

        ll.evenOdd();
        ll.print();
        
    }
}