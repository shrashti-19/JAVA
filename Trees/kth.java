public class kth{
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
    //static int ancestor = -1;
    public static int kthAncestor(Node root, int node, int k){
        if(root==null){
            return -1;
        }
        if(root.data== node){
            return 0;
        }
        //root data not equal then check in left and right
        int leftDistance = kthAncestor(root.left, node, k);
        int rightDistance = kthAncestor(root.right, node, k);

        if(leftDistance==-1 && rightDistance==-1){
            return -1;
        }
        int maximum = Math.max(leftDistance,rightDistance);
        if(maximum+1 == k){
            System.out.println(root.data);
        }
        return maximum+1; // distance from ancestor to root node
        
    }
    public static void main(String args[]){
        Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left =new Node(6);
       root.right.right = new Node(7);
       int node = 4, k =1;
       System.out.println(kthAncestor(root, node, k));
    }
}