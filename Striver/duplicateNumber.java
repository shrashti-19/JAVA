


public class duplicateNumber{
    public static int duplicateNumber(int arr[]){
        //same as linked list approach
        int slow = arr[0];
        int fast = arr[0];
        do { 
            slow = arr[slow];
            fast = arr[arr[fast]];
            
        } while (slow!=fast);

        if(slow == fast){
            slow = arr[0];
            while(slow!=fast){
                slow = arr[slow];
                fast = arr[arr[fast]];
            }
        }

        

        return slow;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        int result = duplicateNumber(arr);
        System.out.println("Duplicate number is " + result);
    }
}