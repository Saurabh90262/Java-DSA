import java.util.Scanner;

public class averageof3numbers {
    public static void main(String[] args) {
        System.out.println("We are calculating the average of 3 numbers");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=(a+b+c)/3;
        System.out.println("The average of three numbers is:"+d);
        input.close(); 
    }
}
