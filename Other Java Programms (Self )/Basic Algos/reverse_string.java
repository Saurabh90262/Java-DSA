import java.util.*;

public class reverse_string {
    static String reverse(String str, int idx) {
        if (idx == str.length()) {
            return "";
        }
        String small_ans = reverse(str, idx + 1);
        return small_ans + str.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str, 0));
        sc.close();
    }
}
