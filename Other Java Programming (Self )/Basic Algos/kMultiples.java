import java.util.*;

public class kMultiples {
    static void mul(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return;
        }
        mul(n, k - 1);
        System.out.println(n * k);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        mul(n, k);
        sc.close();
    }
}
