// import java.util.*;

public class largest_in_Array {
    public static int getLargest_and_smallest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The Smallest value in the Array is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 25, 36, 41, 21, 99, 101, 115, 265, 456, 258, 753 };
        System.out.println("The largest value in the Array is : " + getLargest_and_smallest(arr));
    }
}
