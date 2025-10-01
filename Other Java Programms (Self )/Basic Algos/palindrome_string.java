import java.util.*;

public class palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            int ascii = (int) ch;
            if (ascii >= 97) {
                ascii -= 32;
                char dh = (char) ascii;
                str = str.substring(0, i) + dh + str.substring(i + 1);
            } else {
                ascii += 32;
                char dh = (char) ascii;
                str = str.substring(0, i) + dh + str.substring(i + 1);
            }
        }
        System.out.println(str);
        sc.close();

    }
}
