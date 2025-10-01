import java.util.*;

public class max_arr_recursion {
    static int print_arr_max(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int sa = print_arr_max(arr, idx + 1);
        return Math.max(arr[idx], sa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(print_arr_max(arr, 0));
        sc.close();

    }
}
