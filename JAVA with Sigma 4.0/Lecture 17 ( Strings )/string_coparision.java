public class string_coparision {
    public static void main(String[] args) {
        String str1 = "Tonny";
        String str2 = "Tonny";
        String str3 = new String("Tonny");

        if (str1 == str2) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are not Equal");
        }

        if (str1 == str3) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are not Equal");
        }

        if (str1.equals(str3)) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are not Equal");
        }
    }
}
