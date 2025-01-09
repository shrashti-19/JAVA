public class removeDup{
    public static void removeDuplicates(String str,int idx , StringBuilder newStr , boolean map[]){

        //base case 
        if(idx ==str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currentChar = str.charAt(idx);
        if(map[currentChar-'a']==true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            //character not appeard
            map[currentChar-'a']=true;
            removeDuplicates(str, idx, newStr.append(currentChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "shrashtidwivedi";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
}