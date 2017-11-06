package Recursion;

/**
 * Created by jmobijoh on 10/30/17.
 */
public class RunRecursion {

    public static void main(String[] args) {


        int x = 1;
       /* for (int i = 0; i < 3; i++) {
            x += 5 * i;
        }*/
        x += 5 * 1;
        //x += 5 *2;
        System.out.println(x);

        Fibonacci fibTest = new Fibonacci();
        int fibNum = fibTest.fib(5);
        System.out.println("Fib: " + fibNum);

        System.out.println("Print Series");
        for(int i=0; i<10;i++){
            System.out.println("Fib: " + fibTest.fib(i));
        }

        Factorial fact = new Factorial();
        System.out.println("Factorial: " + fact.fact(5));

        Count count = new Count();
        count.count(0);
    }
}
