

public class add{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail = newNode;
            return;
        }
        newNode.next = head;
        head =  newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public void add(int index , int data){
        Node newNode = new Node(data);
        size++;
        Node temp =head;
        if(index ==0 ){
            addFirst(data);
            return;
        }
        int i=0;
        while(i!=index-1){
            temp = temp.next;
            i++;
            
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        //edge cases
        if(size==0){
            System.out.println("LL is empty!");
        }else if(size==1){
            int val = head.data;
            size=0;
            head=tail=null;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
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
        add list = new add();
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(5);
        list.add(2,9);
        list.ll();
        //System.out.println("Size of linked list is :"+ list.size);
        list.removeFirst();
        list.ll();
        System.out.println(list.size);
    }
}