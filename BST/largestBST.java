public class largestBST{
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
    static class Info{
        boolean bst;
        int size;
        int min;
        int max;

        public Info(boolean bst, int size, int min, int max){
            this.bst = bst;
            this.size = size;
            this.min= min;
            this.max = max;
        }
    }
    public static int maxSize = 0;
    public static Info largest(Node root){
        if(root == null){
            return new Info(true, 0,Integer.MAX_VALUE , Integer.MIN_VALUE);
        }
        Info leftSubtreeInfo = largest(root.left);
        Info rightSubtreeInfo = largest(root.right);

        // self 
        int size = leftSubtreeInfo.size + rightSubtreeInfo.size  +1;
        int min = Math.min(root.data ,  Math.min(leftSubtreeInfo.min,rightSubtreeInfo.min));
        int max= Math.max(root.data ,  Math.max(leftSubtreeInfo.max,rightSubtreeInfo.max));

        //is bst for self
        if(root.data <= leftSubtreeInfo.max || root.data >= rightSubtreeInfo.min){
            return new Info(false, size, min, max);
        }
        //if self is true then check for left and right
        if(leftSubtreeInfo.bst && rightSubtreeInfo.bst){
            maxSize = Math.max(maxSize, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);

    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info = largest(root);
        System.out.println("Maximum size of largest bst in this tree is : " + maxSize);
    }
}