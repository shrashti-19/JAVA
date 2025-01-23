
import java.util.ArrayList;
import java.util.Scanner;

public class Maximum{
    public static int getMaximum(ArrayList<Integer>list){
        int maximum = Integer.MIN_VALUE;
        //finding the maximum of elements
        for(int i=0 ; i<list.size() ; i++){
            if(list.get(i)>maximum){
                maximum = list.get(i);
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements :");
        for(int i=0 ; i<5 ; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println(getMaximum(list));

    }
}