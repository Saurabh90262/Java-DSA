import java.util.*;

public class recursion_factorial_n {
    static int factorial(int n) {
        // int n=n*factorial(n-1);
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
        sc.close();
    }
}
