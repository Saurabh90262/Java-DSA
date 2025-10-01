public class diamond_pattern {
    public static void print_diamond(int n) {
        int l = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= l; k++) {
                System.out.print("*");
            }
            System.out.println();
            l += 2;
        }
        l -= 2;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= l; k++) {
                System.out.print("*");
            }
            System.out.println();
            l -= 2;
        }
    }

    public static void main(String[] args) {
        print_diamond(4);
    }
}
