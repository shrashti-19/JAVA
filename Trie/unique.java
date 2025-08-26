
public class unique{
    public static class Node{
        Node[] children = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0 ; i<26 ; i++){
                children[i]=null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static int countNodes(Node root){
        if(root == null) return 0;
        int count = 0;
        for(int i=0 ; i<26 ; i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String args[]){
        String str = "apple";
        for(int i=0 ; i<str.length() ; i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }
}