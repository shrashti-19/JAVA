

public class search{
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
    public static Node buildTree(Node root, int val)
    {
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = buildTree(root.left, val);
        }else{
            root.right =  buildTree(root.right, val);
        }
        return root;
    }
    public static boolean searchTree(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data  > key){
            //search in left subtree
            return searchTree(root.left, key);
        }else{
            return searchTree(root.right, key);
        }
    }
    public static void main(String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0 ; i<values.length ; i++){
            root = buildTree(root,values[i]);
        }
        System.out.println(searchTree(root, 7));
    }
}