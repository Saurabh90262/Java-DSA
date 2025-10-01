public class set_ith_Bit {
    // set the ith bit to 1
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
}
