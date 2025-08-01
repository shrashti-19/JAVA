
import java.util.*;

//preorder sequence given then we are generating the tree
public class preorder{
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
        static int index=-1;
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
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }
    public static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currentNode = q.remove();
            if(currentNode == null){
                System.out.println(); //nextline print

                if(q.isEmpty()){
                    break;
                }else{
                    //elements bache hue hai
                    q.add(null);
                }
            }else{
                System.out.println(currentNode.data + " ");
                if(currentNode.left!=null){
                    q.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    q.add(currentNode.right);
                }
            }

        }

    }
    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int leftChild = heightOfTree(root.left);
        int rightChild = heightOfTree(root.right);

        int height = Math.max(leftChild, rightChild) +1;
        return height;
        
    }
    public static int countofNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = countofNodes(root.left);
        int rightCount = countofNodes(root.right);
        int finalCount = leftCount + rightCount +1;
        return finalCount;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        int totalSum = leftSum+rightSum + root.data;

        return totalSum;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
        //preorder(root);
        //inorder(root);
        //postorder(root);
        //levelOrderTraversal(root);
        System.out.println("Height of a tree : "+ heightOfTree(root));
        System.out.println("Total Number of Nodes : " + countofNodes(root));
        System.out.println("sum is  : " + sum(root));
    }
}