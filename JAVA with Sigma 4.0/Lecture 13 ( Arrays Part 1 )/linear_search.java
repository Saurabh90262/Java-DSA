public class linear_search {
    public static int lineaeSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 25, 36, 41, 21, 99, 101, 115, 265, 456, 258, 753 };
        int key = 212;
        int index = lineaeSearch(arr, key);
        if(index == -1){
            System.out.println("Key Not Found");
        }else{
            System.out.println("Key is at Index : " + index);
        }
        
    }
}
