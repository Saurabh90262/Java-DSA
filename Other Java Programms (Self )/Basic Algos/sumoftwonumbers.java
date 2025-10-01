import java.util.Scanner;

public class sumoftwonumbers {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println(a+b);
        input.close();
    }
}
