public class string_charAt_Method {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        String str = "Tonny Stark";
        System.out.println(str.charAt(0));
        printLetters(str);
    }
}
