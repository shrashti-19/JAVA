






class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class addTwo{
    public ListNode addTwo(ListNode l1 , ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int sum = carry;
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }

            //connecting nodes
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
        }
        return dummy.next;
    }
    public static void printList(ListNode node){
        while(node!=null){
            System.out.println(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
     ListNode l1 = new ListNode(2);
     l1.next = new ListNode(4);
     l1.next.next= new ListNode(3);
     ListNode l2 = new ListNode(5);
     l2.next = new ListNode(6);
     l2.next.next = new ListNode(4);

     addTwo solution = new addTwo();
     ListNode result = solution.addTwo(l1, l2);
     printList(result);
    }
}