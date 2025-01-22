public class keyboard{
    public static char L[][]={{},{},{'a','b','c'}
    ,{'d','e','f'},
    {'g','h','i'},
    {'j','k','l'},
    {'m','n','o'},
    {'p','q','r','s'},
    {'t','u','v'},
    {'w','x','y','z'}
    };
    public static void lettercombinations(String D){
        int length = D.length();
        if(length == 0){
            System.out.println("");
            return;
        }
        bfs(0,length,new StringBuilder(),D);
    }
    public static void bfs(int position,int length,StringBuilder sb , String D){
        if(position==length){
            System.out.println(sb.toString());

        }else{
            char [] letters = L[Character.getNumericValue(D.charAt(position))];
            System.out.println(letters);

             for(int i=0 ; i<letters.length ; i++){
                 bfs(position+1, length, new StringBuilder(sb).append(letters[i]), D);
             }
         }
         
    }
    public static void main(String[] args) {
        lettercombinations("2");
    }
}