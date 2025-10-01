public class selection_sort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) { // if wanted sorted in decreasing order then just reverse the "<" by ">"
                    minPos = j;
                }
            }
            // swapping of minimum with the current
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
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
        selectionSort(arr);
        printArray(arr);
    }
}
