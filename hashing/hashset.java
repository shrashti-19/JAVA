import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);

        System.out.println(set);
        set.remove(2);

        if(set.contains(2)){
            System.out.println("set contains 2");
        }
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
    

    
}