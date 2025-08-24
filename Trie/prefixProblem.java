public class prefixProblem{
    static class Node{
        Node[] children = new Node[26];
        boolean eow = true;
        int frequency=1;

        public Node(){
            for(int i =0 ; i<26 ; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0 ; i<word.length() ; i++){
            int index = word.charAt(i)-'a';
            if(curr.children[index]== null){
                curr.children[index ] = new Node();
            }else{
                curr.children[index].frequency++;
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans){
        if(root==null) return;
        if(root.frequency == 1){
            System.err.println(ans);
            return;
        }

        for(int i=0 ; i<root.children.length; i++){
            if(root.children[i]!=null){
                findPrefix(root.children[i], ans + (char)(i+'a'));
            }
        }
    }
    public static void main(String args[]){
        String[] words = {"zebra", "dog", "duck","dove"};
        for(int i=0 ;i<words.length ; i++){
            insert(words[i]);
        }
        root.frequency = -1;
        findPrefix(root,"");
    }
}