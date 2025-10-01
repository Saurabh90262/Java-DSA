import java.util.Scanner;

public class Swap_CallByValue {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside function a = " + a);
        System.out.println("Inside function b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("Outside function a = " + a);
        System.out.println("Outside function b = " + b);
        sc.close();
        // The values are not swapped because it is call by value and the changes made
        // by the function are not reflected outdside the function because that are the
        // copy of the actual parameters only;
    }
}
