class Solution {
    // Definition for singly-linked list.
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to merge two sorted linked lists
    public static Node SortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data <= b.data) {
            result = a;
            result.next = SortedMerge(a.next, b);
        } else {
            result = b;
            result.next = SortedMerge(a, b.next);
        }
        return result;
    }

    // Function to merge k sorted linked lists using Divide and Conquer
    public static Node mergeKLists(Node arr[], int last) {
        while (last != 0) {
            int i = 0, j = last;

            while (i < j) {
                arr[i] = SortedMerge(arr[i], arr[j]);
                i++;
                j--;

                // Reduce the range of merging
                if (i >= j) last = j;
            }
        }
        return arr[0];
    }

    // Function to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Driver code
    public static void main(String args[]) {
        int k = 3; // Number of linked lists
        int n = 4; // Number of elements in each list

        Node arr[] = new Node[k];

        // Creating first sorted linked list: 1 -> 3 -> 5 -> 7
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        // Creating second sorted linked list: 2 -> 4 -> 6 -> 8
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        // Creating third sorted linked list: 0 -> 9 -> 10 -> 11
        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        // Merge all k sorted linked lists
        Node mergedHead = mergeKLists(arr, k - 1);

        // Print the merged linked list
        System.out.println("Merged Linked List:");
        printList(mergedHead);
    }
}
