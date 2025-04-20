import java.util.*;
public class roottoleafpath{
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
    public static void print(ArrayList<Integer> path){
        System.out.println(" \n Paths are : ");
        for(int i=0 ; i<path.size() ; i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }
    public static void root2leafPath(Node root, ArrayList<Integer> path){
        if(root == null) return;
        path.add(root.data);
        if(root.left == null && root.right == null){
            print(path);
        }
        root2leafPath(root.left, path);
        root2leafPath(root.right, path);
        path.remove(path.size()-1);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data + "->");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i=0 ; i<values.length ; i++){
            root = buildTree(root,values[i]);
        }
        inorder(root);
        root2leafPath(root, new ArrayList<>());
    }
}