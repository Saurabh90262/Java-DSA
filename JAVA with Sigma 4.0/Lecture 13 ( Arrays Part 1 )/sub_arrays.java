public class sub_arrays {
    public static void print_sub_arrays(int arr[]) {
        int ts = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sb = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sb += arr[k];
                }
                ts++;
                System.out.println();
                System.out.println("The sum of " + ts + "st Sub array is : " + sb);
                if (sb > max) {
                    max = sb;
                }
                if (sb < min) {
                    min = sb;
                }
            }
            System.out.println();
        }
        System.out.println("Total numbers of Sub arrays is : " + ts);
        System.out.println("The sub-array with max Sum is : " + max);
        System.out.println("The sub-array with min Sum is : " + min);
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        print_sub_arrays(arr);
    }
}