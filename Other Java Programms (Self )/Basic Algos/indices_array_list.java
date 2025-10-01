import java.util.*;

public class indices_array_list {
    static ArrayList<Integer> allindices(int arr[], int target, int idx) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx == arr.length) {
            return ans;
        }

        if (arr[idx] == target) {
            ans.add(idx);
        }
        ArrayList<Integer> Smallans = allindices(arr, target, idx + 1);
        ans.addAll(Smallans);
        return ans;
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
        ArrayList<Integer> ans = allindices(arr, key, 0);
        for (Integer i : ans) {
            System.out.println(i);
        }

    }
}
