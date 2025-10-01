import java.util.*;

public class found_indices {
    static void indices(int arr[], int key, int idx) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == key) {
            System.out.println(idx);
        }
        indices(arr, key, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Key :");
        int key = sc.nextInt();
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The answer is:");
        indices(arr, key, 0);
        sc.close();
    }
}
