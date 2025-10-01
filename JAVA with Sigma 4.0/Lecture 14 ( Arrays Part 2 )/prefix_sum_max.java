public class prefix_sum_max {
    public static void prefix_sum(int arr[]) {
        int current_sum = 0;
        int max = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                current_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (current_sum > max) {
                    max = current_sum;
                }
            }
        }
        System.out.println("The sub array with max sum is : " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        prefix_sum(arr);
    }
}
