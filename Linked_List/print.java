public class print {
    public static class Node {  // Change 'public class' to 'public static class'
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;  // Move to the next node
        }
    }

    public static void main(String[] args) {
        print list = new print();
        list.printLL();  // List is empty
        list.addFirst(1);
        list.printLL();  // 1
        list.addFirst(2);
        list.printLL();  // 2 -> 1
        list.addLast(3);
        list.printLL();  // 2 -> 1 -> 3
        list.addLast(4);
        list.printLL();  // 2 -> 1 -> 3 -> 4
    }
}
