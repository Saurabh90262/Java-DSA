public class linear_search_strings {
    public static int string_search(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String arr[] = { "Hello", "Hi", "Welcome", "Saurabh", "Ballia" };
        String key = "Welcome";
        System.out.println("The String is found at index : " + string_search(arr, key));
    }
}
