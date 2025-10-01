import java.util.*;

public class String_remove {
    static String s_remove(String str, int indx) {
        if (indx == str.length()) {
            return "";
        }
        String small_ans = s_remove(str, indx + 1);
        char currChar = str.charAt(indx);
        if (currChar != 'a') {
            return currChar + small_ans;
        } else {
            return small_ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(s_remove(str, 0));
        sc.close();
    }
}
