import java.util.ArrayList;
public class four{
    public static ArrayList BeautifulArray(int n){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1); // Start with the base case
        
        // Construct the array iteratively
        while (result.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            
            // Add all odd numbers from the previous result
            for (int num : result) {
                if (2 * num - 1 <= n) {
                    temp.add(2 * num - 1);
                }
            }
            
            // Add all even numbers from the previous result
            for (int num : result) {
                if (2 * num <= n) {
                    temp.add(2 * num);
                }
            }
            
            result = temp;
        }
        
        return result;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(BeautifulArray(n));
    }
}