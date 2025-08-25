
public class start{
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
        for(int level = 0 ; level<word.length() ; level++){
            int index = word.charAt(level) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static boolean startswith(String prefix){
        Node curr = root;
        for(int level=0 ; level<prefix.length() ; level++){
            int index = prefix.charAt(level)-'a';
            if(curr.children[index]==null){
                return false;
            }

            curr = curr.children[index];
        }
        return true;
    }
    public static void main(String args[]){
        String[] words = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i =0 ; i<words.length ; i++){
            insert(words[i]);
        }
        System.out.println(startswith(prefix1));
        System.out.println(startswith(prefix2));
    }
}