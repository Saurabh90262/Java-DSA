import java.util.*;

public class array_element_sum {
    static int array_sum(int arr[], int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int sum = array_sum(arr, idx + 1);
        return sum + arr[idx];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(array_sum(arr, 0));
        sc.close();
    }
}
