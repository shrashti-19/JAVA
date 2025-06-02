import java.util.*;


public class twosum{
    // Define a static inner class Node
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }
    public static void inorder(Node root, List<Integer> arr){
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.value);
        inorder(root.right, arr);
    }
    public static boolean twosumBST(Node root1,Node root2, int target){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inorder(root1,list1);
        inorder(root2,list2);

        int i=0 , j = list2.size()-1;
        while(i<list1.size() && j>=0){
            int val1 = list1.get(i);
            int val2 = list2.get(j);
            int sum = val1+val2;
            if(sum == target) {
                System.out.println("Pairs found " + val1 + " and " + val2 + " for target: " + target);
                return true;
            }
            else if(sum<target) {
                i = i+1;
            }else{
                j=j-1;
            }
        }
        return false;
    }

    public static void main(String args[]){
        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right = new Node(7);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);

        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);
        int target = 16;
        System.out.println("Pairs exists :  " + twosumBST(root1, root2, target));
    }
}