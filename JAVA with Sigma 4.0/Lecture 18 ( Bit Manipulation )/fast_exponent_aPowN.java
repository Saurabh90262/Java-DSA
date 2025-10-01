public class fast_exponent_aPowN {
    public static int fastExponent(int a, int n) { // O(log n + 1)
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // check LSB is 1 or not
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExponent(5, 3));
    }
}
