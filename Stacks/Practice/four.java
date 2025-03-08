
import java.util.Stack;

public class four{
    public static int trappingRainwater(int arr[]){
        Stack<Integer> s = new Stack<>();
        int water = 0;
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
          while(!s.isEmpty() && arr[i]>arr[s.peek()]){
            int top = s.pop();

            if(s.isEmpty()){
                break; //no left boundary
            }

            int distance = i - s.peek()-1;
            int boundedHeight = Math.min(arr[i],arr[s.peek()])-arr[top];
            water += boundedHeight * distance;
          }
          s.push(i);
        }
        return water;
    }
    public static void main(String[] args) {
        int arr[] = {7,0,4,2,5,0,6,4,0,6};
        System.out.println(trappingRainwater(arr));
    }
}