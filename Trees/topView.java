
import java.util.*;

public class topView{
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
        int hd;//horizontal distance;
        Node node;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topViewTree(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min=0,max=0;

        //level order traversal + horizontal distance
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info current = q.remove();
            if(current==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                //checking whether current is coming for the first time in map
                if(!map.containsKey(current.hd)){
                    map.put(current.hd, current.node);
                }
                if(current.node.left!=null){
                    q.add(new Info(current.node.left, current.hd-1));
                    min = Math.min(min,current.hd-1);

                }
                if(current.node.right!=null){
                    q.add(new Info(current.node.right, current.hd+1));
                    max = Math.max(max, current.hd+1);
                }
            }
           

        }

         //print
         for(int i=min ; i<=max; i++){
            System.out.println(map.get(i).data + " ");
         }


    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        topViewTree(root);
    }
}