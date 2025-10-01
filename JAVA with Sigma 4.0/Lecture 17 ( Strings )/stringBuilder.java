public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println("Converted stringBuilder to String : ");
        System.out.println(sb.toString());

        Integer a = 10;                 // here a is treated as Object and therefore conversion to String is Possible.
        System.out.println(a.toString());
    }
}
