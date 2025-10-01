public class print_all_substrings {
    public static void printSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String str = "Hello";
        printSubstrings(str);
    }
}
