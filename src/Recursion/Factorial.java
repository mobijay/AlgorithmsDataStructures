package Recursion;

/**
 * Created by jmobijoh on 10/30/17.
 */
public class Factorial {

    public int fact(int n) {
        if(n <=0 ) {
            return 0;
        }

        if(n==1) {
            return 1;
        }

        return n * fact(n-1);
    }
}
