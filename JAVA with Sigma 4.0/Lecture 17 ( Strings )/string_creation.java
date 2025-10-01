public class string_creation {
    public static void main(String[] args) {
        char ch[] = { 'a', 'b', 'c', 'd' };
        String str = "Hello";
        String str2 = new String("Hello world");

        // Strings in java are IMMUTABLE
        // String is inbuilt class , string can created or declared by invoking inbuilt
        // String class
        System.out.println(ch);
        System.out.println(str);
        System.out.println(str2);
    }
}
