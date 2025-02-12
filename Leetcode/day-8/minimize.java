import java.util.Arrays;

public class minimize{
    public static int minimizedMaximum(int n,int quantites[]){
        int low = 1; 
        int high = Arrays.stream(quantites).max().orElse(1);
        while (low < high) {
            int mid = (low + high) / 2;
            int requiredStores = 0;
            for (int quantity : quantites) {
                requiredStores += (quantity + mid - 1) / mid;
            }
            if (requiredStores > n) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int quantites[] = {11,6};
        int n=6;
        System.out.println( minimizedMaximum(n,quantites));
    }
}