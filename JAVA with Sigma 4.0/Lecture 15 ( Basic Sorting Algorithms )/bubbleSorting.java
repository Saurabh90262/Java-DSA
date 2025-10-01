public class bubbleSorting {
    public static void bubbleSort(int arr[]) {
        // algorithm for bubble sort
        for (int turn = 0; turn < arr.length - 1; turn++) { // runs till n-2
            boolean swap = false;
            for (int j = 0; j < arr.length - turn - 1; j++) { // runs till n-turn-1
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
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
        bubbleSort(arr);
        printArray(arr);
    }
}

// Time complexity is O(n^2)