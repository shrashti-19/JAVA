public class second{
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
    public static Node invertTree(Node root){
        if(root==null){
            return null;
        }
        Node lefttree = invertTree(root.left);
        Node righttree = invertTree(root.right);

        root.left = righttree;
        root.right = lefttree;

        return root;
    }
    public static void preorder (Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data + ",");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(invertTree(root));
        preorder(root);
    }
}