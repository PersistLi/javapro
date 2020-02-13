package Test;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n){
        int x = 1;
        int y = 1;
        int sum = 0;
        if (n==1||n==2){
            return 1;
        }else {
            for (int i = 3; i<=n; i++) {
                sum = x + y;
                x = y;
                y = sum;
            }
        }
        return y;
    }
}
