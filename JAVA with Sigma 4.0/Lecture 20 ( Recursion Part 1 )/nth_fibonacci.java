public class nth_fibonacci{
    public static int nth_fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return nth_fib(n-1)+nth_fib(n-2);

    }
    public static void main(String[] args) {
        System.out.println(nth_fib(26));
    }
}