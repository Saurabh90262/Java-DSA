public class palindrome_string {
    public static boolean isPlaindrome(String str) { // Linear Time Complexity O(n)
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        String str2 = "hello";
        System.out.println(isPlaindrome(str));
        System.out.println(isPlaindrome(str2));
    }
}
