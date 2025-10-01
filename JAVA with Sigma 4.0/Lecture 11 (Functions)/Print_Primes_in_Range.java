public class Print_Primes_in_Range {
    public static boolean checkPrime(int n) {
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrintPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) { // true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrintPrimes(100);
    }
}
