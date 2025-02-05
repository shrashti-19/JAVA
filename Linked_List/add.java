



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

    public int removeLast(){
       if(size==0){
        System.out.println("LL is empty");
       }else if(size==1){
        int val = head.data;
        head = tail = null;
        size=0;
        return val;
       }

       //prev = i : size-2;
       Node prev = head;
       for(int i =0 ; i<size-2 ; i++){
        prev = prev.next;
       }

       int val = prev.next.data;
       prev.next = null;
       tail = prev;
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
    public int SearchIter(int key){
        Node temp=head;
        int index=0;
        while(temp!=null){
            if(temp.data==key){
                return index;
            }
            temp=temp.next;
            index++;
        }

        return -1;
    }
    public static int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int index = helper(head.next, key);
        if(index==-1){
            return -1;
        }
        return index+1;
    }

    public int recursiveSearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node prev = null;
        Node current = tail=head;

        while(current!=null){
            Node next = current.next;
            current.next = prev;
            prev= current;
            current = next;
        }
        head = prev;
    }

    public void deleteNthNode(int n){
        //calculate size
        if(head==null) return;
        Node temp = head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        if(n>size) return;
        //head delete
        if(n==size){
            head=head.next;
            return;
        }

        //other elements
        
        int iToFound = size-n;
        Node prev = head;
        for(int i=1 ; i<iToFound ; i++){
            prev = prev.next;
            
        }
        prev.next = prev.next.next;
    }


    public Node findMid(Node head){//helper function
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //middle node
    }

    public boolean checkPalindrome(){
        //edge case

        if(head==null || head.next==null ) return true;

        //step - find mid
        Node midNode = findMid(head);

        //2- reverse the linked list
        Node prev = null;
        Node current = midNode;
        Node next;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        } 

        //right half head
        Node right = prev;
        Node left = head;
        //check the left part adn right part

        while(right!=null){
            if(left.data !=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static void main(String[] args) {
        add list = new add();
        // list.addFirst(1);
        // list.addFirst(3);
        // list.addFirst(4);
        // list.addLast(5);
        // list.add(2,9);
        // list.ll();
        // //System.out.println("Size of linked list is :"+ list.size);
        // list.removeFirst();
        // list.ll();
        // System.out.println(list.size);

        // list.removeLast();
        // list.ll();
        // System.out.println(list.size);

        // int key=9;
        // System.out.println(list.SearchIter(key));

        // System.out.println(list.recursiveSearch(key));

        // // list.reverse();
        // // list.ll();

        // System.out.println("Deletion from Nth Node");
      
        // list.deleteNthNode(3);
        // list.ll();

        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        // list.addLast(1);
        list.ll();

        System.out.println(list.checkPalindrome());
    }
}