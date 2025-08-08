import java.util.*;
public class hashset2{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Mumbai");

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Bangalore");
        lhs.add("Mumbai");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Bangalore");
        ts.add("Mumbai");
        System.out.println(ts);
    }
}