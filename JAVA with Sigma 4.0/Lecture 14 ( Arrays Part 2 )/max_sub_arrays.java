public class max_sub_arrays {
    public static void print_sub_arrays(int arr[]) {
        int ts = 0;
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int current_sum = 0;
                for (int k = i; k <= j; k++) {
                    current_sum += arr[k];
                }
                ts++;
                // System.out.println();
                // System.out.println("The sum of " + ts + "st Sub array is : " + current_sum);
                if (current_sum > max_sum) {
                    max_sum = current_sum;
                }
                if (current_sum < min_sum) {
                    min_sum = current_sum;
                }
                System.out.println();
            }
        }
        // System.out.println("Total numbers of Sub arrays is : " + ts);
        System.out.println("The sub-array with max Sum is : " + max_sum);
        // System.out.println("The sub-array with min Sum is : " + min_sum);
        // System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {8, -1, 3, 4, -3, 2, 1};
        int arr2[] = {5,2,-6,1,4,2,-2,-3,7,2,11,-14};
        print_sub_arrays(arr);
        print_sub_arrays(arr2);
    }
}