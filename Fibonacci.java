public class Fibonacci {
    static int fibonacciNumber = 25;
    static long[] fibonacciTemp = new long[fibonacciNumber+1];
    public static void main(String[] args) {
        for(int counter=0;counter<=fibonacciNumber;counter++){
            System.out.println(fibonacci(counter));
        }
    }
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int fib = fibonacci(n-1)+fibonacci(n-2);
        fibonacciTemp[n] = fib;
        return(fib);
    }
}
