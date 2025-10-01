public class check_even_odd {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        int num = 6;
        oddOrEven(num);
        oddOrEven(11);
    }
}
