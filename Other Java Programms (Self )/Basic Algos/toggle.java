import java.util.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int len = str.length();
        for (int i = 0; i < len; i++) {
            // boolean check = true;
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            int cv = (int) ch;
            if (cv >= 97) {
                cv -= 32;
            } else {
                cv += 32;
            }
            char vc = (char) cv;
            str.setCharAt(i, vc);
        }
        System.out.println(str);
        sc.close();
    }
}
