public class print{
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
    public static void printInRange(Node root, int k1,int k2){
        if(root == null) return;

        if(root.data >= k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.println(root.data + " ");
            printInRange(root.right, k1, k2);
        }else if(root.data > k2){
            printInRange(root.right, k1, k2);
        }else{
            printInRange(root.left, k1, k2);
        }
    }
    public static void main(String args[]){
        int values[]= {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i =0 ; i<values.length ; i++){
            root = buildTree(root,values[i]);
        }
        printInRange(root, 5, 12);
    }
}