import java.util.ArrayList;
public class four{
    public static ArrayList BeautifulArray(int n){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=2 ; i<=n ; i=i+2){
            result.add(i);
        }
        for(int i=1 ; i<=n ; i=i+2){
            result.add(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(BeautifulArray(n));
    }
}