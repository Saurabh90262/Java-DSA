import java.util.*;

public class sub_str {
    static ArrayList<String> subStr(String str) {
        if (str.length() == "") {
            ans.add("");
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        char curr = str.charAt(0);
        ArrayList<String> Smallans = subStr(str.substring(0));
        for (String i : Smallans) {
            ans.add(i);
            ans.add(curr + i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> ans = subStr(str);
        for (String i : Smallans) {
            System.out.println(ss);
        }
        sc.close();
    }
}
