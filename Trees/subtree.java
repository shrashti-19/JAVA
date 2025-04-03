public class subtree{
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
    public static boolean isSubtree(Node root , Node subtree){

        if(root == null){
            return false;
        }
        if(root.data == subtree.data){
            if(isIdentical(root,subtree)){
                return true;
            }
        }
        boolean leftAns = isSubtree(root.left, subtree);
        boolean rightAns = isSubtree(root.right, subtree);

        return leftAns || rightAns;
    }
    public static boolean isIdentical(Node node , Node subtree){
        //this function is called when roots are matched in this case left ans root has matched

        if(node == null && subtree == null){
            return true;
        }else if( node == null || subtree == null || node.data!=subtree.data) {
            return false;
        }
        if(!isIdentical(node.left, subtree.left)){
            return false;
        }
        if(!isIdentical(node.right, subtree.right)){
            return false;
        }
        return true;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        Node subtree = new Node(2);
        //subtree.right = new Node(5);
        subtree.left = new Node(4);
        System.out.println(isSubtree(root, subtree));
        }
}
