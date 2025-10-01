public class kanads_alogo_max_subarray {
    public static void kadanes(int numbers[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            current_sum += numbers[i];
            if (current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(current_sum, max_sum);
        }
        if (max_sum == 0) {
            int maximum = Integer.MIN_VALUE;
            for (int i = 0; i < numbers.length; i++) {
                maximum = Math.max(maximum, numbers[i]);
            }
            System.out.println("The maximum sub array is : " + maximum);
            return;
        }
        System.out.println("Our maximum sub array sum is : " + max_sum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(numbers);
        int arr[] = { -3, -5, -7, -1, -11 };
        kadanes(arr);
    }
}
