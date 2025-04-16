public class fifth{
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
    static int maxSum;
    public static int maxPathSum(Node root){
        maxSum = Integer.MIN_VALUE;
        maxGain(root);
        return maxSum;
    }
    public static int maxGain(Node node){
        if(node == null) return 0;
        int leftGain = Math.max(maxGain(node.left),0);  //ignoring negatives
        int rightGain = Math.max(maxGain(node.right),0);
        int currentSum = leftGain + rightGain +  node.data;
        maxSum = Math.max(maxSum, currentSum);

        return node.data + Math.max(leftGain , rightGain);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Maximum sum is :" + maxPathSum(root));
    }
}