import java.util.ArrayList;
import java.util.Scanner;
public class Swap{
    public static void swapNumbers(ArrayList<Integer>list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);


    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements :");
        for(int i=0 ; i<5 ; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        swapNumbers(list,1,3);
        for(int num : list){
            System.out.println("Swapped numbers of list " + num);
        }
       
    }
}