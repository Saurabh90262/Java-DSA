package MethodsInJava;

import java.util.*;

class Multiplier {
    int mul(int a, int b) {
        int ans = a * b;
        return ans;
    }
}

public class multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Multiplier obj = new Multiplier();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = obj.mul(x, y);
        System.out.println(result);
        sc.close();
    }
}
