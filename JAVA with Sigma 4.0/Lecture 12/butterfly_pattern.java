public class butterfly_pattern {
    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2*(n - i); k++) {
                System.out.print(" ");
            }
            // for (int l = 1; l <= n - i; l++) {
            //     System.out.print(" ");
            // }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2*(i - 1); k++) {
                System.out.print(" ");
            }
            // for (int l = 1; l <= i - 1; l++) {
            //     System.out.print(" ");
            // }
            for (int m = 1; m <= n - i + 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(4);
    }
}
