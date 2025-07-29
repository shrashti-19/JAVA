import java.util.*;

public class first{
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China", 120);
        hm.put("USA", 150);
        System.err.println(hm);

        int population = hm.get("India");
        System.out.println(population);

        // int pop2= hm.get("Indoensia");
        // System.err.println(pop2);
        
        System.out.println(hm.containsKey("India"));
        hm.remove("China");
        System.out.println(hm);

        System.out.println(hm.size());

        hm.clear();
        System.out.println(hm.isEmpty());
    } 
}