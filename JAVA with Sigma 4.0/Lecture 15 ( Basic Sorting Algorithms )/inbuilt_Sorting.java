import java.util.Arrays;
import java.util.Collections;

public class inbuilt_Sorting {
    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 4, 3, 1 };
        // sorting by inbuilt function
        Arrays.sort(arr);
        printArray(arr);

        // sorting to some indexes
        int arr3[] = { 5, 2, 4, 3, 1 };
        Arrays.sort(arr3, 0, 3);
        printArray(arr3);

        // Arrays arr2 is declared as Object array
        Integer arr2[] = { 6, 2, 5, 1, 4 };
        Arrays.sort(arr2,Collections.reverseOrder());
        printArray(arr2);
    }
}
