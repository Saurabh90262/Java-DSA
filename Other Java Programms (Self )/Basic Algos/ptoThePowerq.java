import java.util.*;

public class ptoThePowerq {
    static int calc(int p, int q) {
        if (q == 0)
            return 1;
        else if (q % 2 == 0) {
            int ans = calc(p, q / 2);
            return ans * ans;
        } else {
            int ans = calc(p, q / 2);
            return ans * ans * p;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        sc.close();
        System.out.println(calc(p, q));
    }
}
