
import java.util.ArrayList;

public class inversions{
    
    public static long countInversions(ArrayList<Integer>arr){
        int inversions=0;
        for(int i=0 ; i<arr.size() ; i++){
            for(int j=i+1 ; j<arr.size() ; j++){
                if(arr.get(i)>arr.get(j)){
                    inversions++;
                 

                }
            }
        }
        return inversions;
    }
    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(2);
       arr.add(4);
       arr.add(1);
       
       long result = countInversions(arr);
       System.out.println(result);

    }
}