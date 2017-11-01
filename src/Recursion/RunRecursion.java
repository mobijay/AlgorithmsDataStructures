package Recursion;

/**
 * Created by jmobijoh on 10/30/17.
 */
public class RunRecursion {

    public static void main(String[] args) {

        Fibonacci fibTest = new Fibonacci();
        int fibNum = fibTest.fib(6);
        System.out.println("Fib: " + fibNum);

        System.out.println("Print Series");
        for(int i=0; i<9;i++){
            System.out.println("Fib: " + fibTest.fib(i));
        }

        Factorial fact = new Factorial();
        System.out.println("Factorial: " + fact.fact(5));
    }
}
