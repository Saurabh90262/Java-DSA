import java.util.*;

public class input_output {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine(); // next() input only single word up to 1st space
        System.out.println(name);
        sc.close();
    }
}
