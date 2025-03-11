public class QueueLL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        public static Node head = null ;
        public static Node tail = null;

        public  boolean isEmpty(){
            if(head== null && tail == null){
                return true;
            }
            return false;
        }
        public void add(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }
           
            tail.next = newNode;
            tail = newNode;
        }

        public  int remove(){
            int front = head.data;
            if(isEmpty()==true){
                System.out.println("Queue is empty");
                return -1;
            }
 
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }

            return front;
        }

        public int peek(){
            if(isEmpty()==true){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}