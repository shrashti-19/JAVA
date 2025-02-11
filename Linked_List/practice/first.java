public class first{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public Node getIntersectionPoint(Node head1,Node head2){
        while(head2!=null){
            Node temp = head1;
            while(temp!=null){
                if(temp==head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2=head2.next;
        }
        return null;
    }
    public static void main(String[] args){
        first ll = new first();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);
        Node newNode = new Node(9);
        head2.next = newNode;
        Node anotherNewNode = new Node(6);
        head2.next.next = anotherNewNode;
        Node newNode2 = new Node(15);
        head1.next = newNode2;
        head2.next.next.next = newNode2;
        Node newnNode3 = new Node(30);
        head1.next.next = newnNode3;
        head1.next.next.next= null;

        Node intersectionPoint = ll.getIntersectionPoint(head1,head2);
        if(intersectionPoint == null){
            System.out.println("No intersection point is found");
        }else{
            System.out.println("Intersection Point found "+ intersectionPoint.data);
        }
        
        
    }
}