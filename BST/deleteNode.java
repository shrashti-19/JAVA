public class deleteNode{
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
        if(root == null){
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
    public static Node delete(Node root, int val){
        // step : 1 search the value
        if(root.data  > val){
            root.left = delete(root.left, val);
        }else if(root.data < val){
            root.right = delete(root.right, val);
        }else{
            // we have searched the key which is to be deleted
            // case : 1 leaf node to be deleted means it's both childrens are null
            if(root.left == null && root.right == null){
                return null;
            }
            // case : 2 only one child replace it with the child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // case 3 : node to be deleted have both childs
            Node IS = inorderSucessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }
    public static Node inorderSucessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.data + ",");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]= {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i =0 ; i<values.length ; i++){
            root = buildTree(root,values[i]);
        }
        inorder(root);
        root = delete(root, 5);
        System.out.println();
        inorder(root);
    }

}