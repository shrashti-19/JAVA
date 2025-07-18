

public class diameter{
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
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            int heightOfTree = Math.max(lh,rh)+1;
            return heightOfTree;
        }

        //diameter of a tree
        public static int diameter(Node root){
            //base case
            if(root == null){
                return 0;
            }
            int ldiameter = diameter(root.left);
            int rdiameter = diameter(root.right);
            int lheight = height(root.left);
            int rheight = height(root.right);
            int selfHeight = lheight+rheight+1;
            
            int fdiameter = Math.max(selfHeight, Math.max(rdiameter, ldiameter));
            return fdiameter;


        }
        static class Info{
            int diam;
            int ht;
            
            public Info(int diam,int ht){
                this.diam = diam;
                this.ht = ht;
            }
        }
        public static Info diamter2(Node root){
            if(root == null){
                return new Info(0,0);
            }

            Info leftInfo = diamter2(root.left);
            Info rightInfo = diamter2(root.right);

            int selfDiamter = Math.max(Math.max(leftInfo.diam,rightInfo.diam) , leftInfo.ht+rightInfo.ht+1);
            int height = Math.max(leftInfo.ht,rightInfo.ht)+1;

            return new Info(selfDiamter,height);
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(BinaryTree.diameter(root));
        System.out.println(BinaryTree.diamter2(root).diam);
    }
}