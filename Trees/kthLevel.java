public class kthLevel{
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

    public static void kthLevelprint(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level == k){
            System.out.println(root.data + " ");
            return;
        }
        kthLevelprint(root.left, level+1, k);
        kthLevelprint(root.right, level+1, k);

    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int level =1 ;
        int k = 2;
        kthLevelprint(root,level,k);
    }
}