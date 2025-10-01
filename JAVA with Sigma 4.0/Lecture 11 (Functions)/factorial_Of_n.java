public class factorial_Of_n {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 4;
        int result = factorial(n);
        System.out.println("The factorial of " + n + " is : " + result);
        System.out.println(factorial(5));
    }
}
