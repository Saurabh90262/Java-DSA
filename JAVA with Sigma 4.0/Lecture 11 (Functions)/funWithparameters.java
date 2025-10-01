import java.util.Scanner;

public class funWithparameters {
    public static int calcSum(int n1, int n2) { // parmeters or formal Parameters;
        int sum = n1 + n2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int addsum = calcSum(a, b); // arguments or actual parameters;
        System.out.println(addsum);
    }
}
