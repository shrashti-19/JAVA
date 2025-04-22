public class mirror{
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
    public static Node buildTree(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = buildTree(root.left, val);
        }else{
            root.right = buildTree(root.right, val);
        }
        return root;

    }
    public static Node mirrorBST(Node root){
        if(root == null) return null;
        Node leftSubTree = mirrorBST(root.left);
        Node rightSubTree = mirrorBST(root.right);
        root.left = rightSubTree;
        root.right = leftSubTree;

        return root;
    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.println(root.data + ",");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        int values[] = {8,5,3,6,10,11};
        Node root = null;
        for(int i=0 ; i<values.length ; i++){
            root = buildTree(root,values[i]);
        }
        root = mirrorBST(root);
        preorder(root);
    }
}