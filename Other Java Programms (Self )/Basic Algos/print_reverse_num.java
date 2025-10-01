import java.util.*;

public class print_reverse_num {
    static void print_rev(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print_rev(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_rev(n);
        sc.close();
    }
}
