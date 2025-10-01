public class insertion_sort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding the current position to insert
            while (prev >= 0 && curr < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // performing the insertion
            arr[prev + 1] = curr;
        }
    }

    // printing the sorted array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 4, 3, 1 };
        insertionSort(arr);
        printArray(arr);
    }
}
