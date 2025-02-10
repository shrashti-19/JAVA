public class circularLinkedList{
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

    static Node addToEmpty(Node last , int data){
        if(last!=null){
            return last;
        }
        Node newNode = new Node(data);
        last = newNode;
        newNode.next = last;
        return last;
    }

    static Node addFront(Node last , int data){
        if(last == null){
            return addToEmpty(last, data);
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    static Node addToEnd(Node last , int data){
        if(last==null){
            return addToEmpty(last, data);
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    static Node addAfter(Node last, int data,int item){
        if(last==null){
            return addToEmpty(last, data);
        }
        Node p = last.next;
        do {
            if (p.data == item) {
                Node newNode = new Node(data);
                newNode.next = p.next;
                p.next = newNode;
                if (p == last) {
                    last = newNode;
                }
                return last;
            }
            p = p.next;
        }
         while (p != last.next);
        System.out.println(item + " not present in the list.");
        return last;
        
    }

    static Node deleteNode(Node last, int key){
        if (last == null) {
            return null;
        }

        Node curr = last.next, prev = last;
        while (curr.data != key) {
            if (curr == last) {
                System.out.println(key + " not found in the list.");
                return last;
            }
            prev = curr;
            curr = curr.next;
        }

        if (curr == last && curr.next == last) {
            last = null;
        } else if (curr == last) {
            prev.next = curr.next;
            last = prev;
        } else {
            prev.next = curr.next;
        }

        return last;
    }

    static void traverse(Node last){
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        Node p = last.next;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);
        System.out.println();
    }
 
    public static void main(String[] args) {
        Node last = null ;
        last = addToEmpty(last,6);
        last = addToEnd(last,8);
        last = addFront(last,2);
        last = addAfter(last,10,2);
        traverse(last);
        deleteNode(last,8);
        traverse(last);
    }
}