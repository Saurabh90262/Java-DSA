import java.util.*;

public class sumOfDigits_Recursion {
    static int calSum(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        return calSum(n / 10) + n % 10;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calSum(n);
        System.out.println(calSum(n));
        sc.close();
    }
}
