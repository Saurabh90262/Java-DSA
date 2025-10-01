public class function_Overloading {

    // This is the example of function overloading with parameters.

    // function to calculate the sum of two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate the sum of three numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(5, 2, 1));
    }
}
