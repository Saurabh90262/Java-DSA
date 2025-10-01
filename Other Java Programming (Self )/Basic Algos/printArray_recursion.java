import java.util.*;

public class printArray_recursion {
    static void print_arr(int[] arr, int n) {
        if (n == 0) {
            System.out.println(arr[n]);
            return;
        }
        print_arr(arr, n - 1);
        System.out.println(arr[n]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print_arr(arr, n);
        sc.close();
    }
}
