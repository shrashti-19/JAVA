import java.util.Stack;

public class flatten {
    class Node {
        int val;
        Node next;
        Node prev;
        Node child;

        public Node(int val) {  // Correct constructor
            this.val = val;
            this.next = null;
            this.prev = null;
            this.child = null;
        }
    }

    public Node flatten(Node head) {
        if (head == null) return head;
        
        Node current = head;
        Stack<Node> stack = new Stack<>();
        
        
        while (current != null) {
            
            if (current.child != null) {
                if (current.next != null) {
                    stack.push(current.next);  
                }

                
                current.next = current.child;
                current.next.prev = current;
                current.child = null;
            }
        
          
            if (current.next == null && !stack.isEmpty()) {  
                current.next = stack.pop();
                current.next.prev = current;
            }
            
            current = current.next;
        }
        return head;
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        flatten list = new flatten();
        
        // Example: Creating a multilevel doubly linked list
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.prev = head;
        head.next.next = list.new Node(3);
        head.next.next.prev = head.next;
        
        // Adding child to node 2
        head.next.child = list.new Node(7);
        head.next.child.next = list.new Node(8);
        head.next.child.next.prev = head.next.child;
        
        head = list.flatten(head);
        
        list.printList(head);
    }
}
