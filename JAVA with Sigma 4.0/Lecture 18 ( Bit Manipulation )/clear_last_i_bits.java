public class clear_last_i_bits {
    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i; // -1 << i
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIBits(15, 2)); // 2^2 + 2^3 = 12
    }
}
