import java.util.*;

public class linear_search_recursion {
    static void linearSearch(int arr[], int key, int idx) {
        if (idx == arr.length) {
            System.out.println("-1");
            return;
        }
        if (arr[idx] == key) {
            System.out.println(idx);
            return;
        }
        linearSearch(arr, key, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        linearSearch(arr, key, 0);
        sc.close();
    }
}
