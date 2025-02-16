
import java.util.Stack;

// public class nextElement{
//     public static int[] greaterElement(int arr[]){
//         int n  = arr.length;
//         int[] result = new int[n];
//         for(int i=0 ; i<n ; i++){
//             result[i] = -1; // default value if no greater element is found
//             for(int j=i+1 ; j<n ; j++){
//                 if(arr[j]>arr[i]){
//                     result[i] = arr[j];
//                     break;
//                 }
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args){
//         int arr[] = {6,8,0,1,3};
//         int result[] = greaterElement(arr);
//         for(int i=0 ; i<result.length ; i++){
//             System.out.print(result[i]+" ");
//         }
//         System.out.println("");
//     }
// }

//STACK APPROACH
public class nextElement{
    public static void main(String[] args) {
        int arr[] = {9,6,4,1,0,3};
        Stack<Integer> s = new Stack<>();
        int  nextGreaterElement[] = new int[arr.length];
        for(int i =arr.length-1 ; i>=0 ; i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreaterElement[i]=-1;
            }else{
                nextGreaterElement[i] = arr[s.peek()]; //number ko store
            }
            s.push(i);//index of that element store
        }

        for(int i=0 ; i<nextGreaterElement.length ; i++){
            System.out.print(nextGreaterElement[i]+ " ");
        }
        System.out.println();
    }
}