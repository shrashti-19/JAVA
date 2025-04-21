public class validBST{
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
    public static boolean validateBST(Node root , Node min, Node max){
        if(root== null) return true;
        if(min!=null && root.data <=min.data){
            return false;
        }
        if(max!=null && root.data >= max.data){
            return false;
        }
        return validateBST(root.left,min,root) && validateBST(root.right,root,max);
    }
    public static void main(String args[]){
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i=0 ; i<values.length ; i++){
            root = buildTree(root,values[i]);
        }
        Node max = null, min = null;
        System.out.println(validateBST(root,null,null));
    }
}