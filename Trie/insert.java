public class insert{
    static class Node{
        Node[] array = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0 ; i<26 ; i++){
                array[i] = null;
            }
        }
    }
    public static Node root = new Node(); //null
    public static void insert(String word){
        Node current = root;
        for(int level = 0 ; level<word.length() ; level++){
            int idx = word.charAt(level)-'a';
            if(current.array[idx] == null){
                current.array[idx] = new Node();
            }
            current = current.array[idx];
        }
        current.eow = true; //word end
    }

    public static boolean search(String key){
        Node current = root;

        for(int level =0 ; level<key.length() ; level++){
            int idx = key.charAt(level)-'a';
            if(current.array[idx]==null){
                return false;
            }
            current = current.array[idx];
        }
        return current.eow == true;
    }
    public static boolean wordBreak(String key){
        if(key.length()==0) return true;

        for(int i=1 ; i<=key.length() ; i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        String words[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i=0 ; i<words.length ; i++){
            insert(words[i]);
        }

        // System.out.println(search("the"));
        // System.out.println(search("an"));
        String key = "ilikesamsu";
        System.out.println(wordBreak(key));


    }
}