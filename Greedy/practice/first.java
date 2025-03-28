public class first{
    public static void main(String args[]){
        String str = "LRRRRLLRLLRL";
        int partitions =0;
        int balance = 0;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == 'L'){
               balance+=1;
            }
            if(str.charAt(i)=='R'){
                balance+=-1;
            }
            if(balance == 0){
                partitions++;
            }
        }
        System.out.println("Partitions required is : "+ partitions);
    }
}