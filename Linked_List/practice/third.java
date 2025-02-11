

public class third{
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
    public void swappingNode(int x , int y){
        Node prevx=null , prevy = null;
        Node cx =head,cy=head;
        while (cx != null && cx.data != x) {
            prevx = cx;
            cx = cx.next;
        }
        while (cy != null && cy.data != y) {
            prevy = cy;
            cy = cy.next;
        }

        if (cx == null || cy == null) {
            return;
        }

        if (prevx != null) {
            prevx.next = cy;
        } else {
            head = cy;
        }

        if (prevy != null) {
            prevy.next = cx;
        } else {
            head = cx;
        }

        Node temp = cx.next;
        cx.next = cy.next;
        cy.next = temp;



    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        third ll = new third();
        head = new Node(1);
        Node newNode = new Node(2);
        head.next = newNode;
        newNode = new Node(2);
        head.next.next = newNode;
        newNode = new Node(3);
        head.next.next= newNode;
        newNode = new Node(4);
        head.next.next.next = newNode;
        head.next.next.next.next = null;
        int x=2,y=4;
        ll.swappingNode(x,y);
        ll.print();
    }
}