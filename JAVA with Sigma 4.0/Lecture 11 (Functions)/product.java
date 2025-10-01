public class product {
    public static int mul(int a, int b) {
        int prod = a * b;
        return prod;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int res = mul(a, b);
        System.out.println("a * b = " + res);
    }
}
