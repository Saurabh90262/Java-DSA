import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.remove(3);
        if (set.contains(1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(set.size());
        System.out.println(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
