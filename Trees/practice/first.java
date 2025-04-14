

public class first{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isunivalueBinary(Node root){
        return isunivalueBinaryHelper(root,root.data);
    }
    public static boolean isunivalueBinaryHelper(Node node, int data){
        if(node == null){
            return true;
        }
        if(node.data != data){
            return false;
        }
        return isunivalueBinaryHelper(node.left, data) && isunivalueBinaryHelper(node.right, data);
    }
    public static void main(String args[]){
        Node root = new Node(2);
        root.left = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        root.right = new Node(2);
        root.right.left = new Node(2);
        root.right.right = new Node(2);
        System.out.println(isunivalueBinary(root));
    }
}