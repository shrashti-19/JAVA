import java.util.*;
public class first{
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        int N = 5;
        for(int i=1 ; i<=N ; i++){
            int num = i;
            String binary = "";
            while(num>0){
                int ld = num%2;
                binary = ld+binary;
                num = num/2;
            }
            q.add(binary);
        }
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}