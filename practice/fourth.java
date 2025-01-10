public class fourth{
    public static void towerOfHanoi(int n,String source,String helper , String destination){
        if(n==1){
            System.out.println("transfer disc "+n + "from "+ source + " to " + destination );
            return;
        }
        towerOfHanoi(n-1, source, helper, destination);
        towerOfHanoi(n-1, helper,source, destination);
    }
    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n,"A","B","C");
    }
}