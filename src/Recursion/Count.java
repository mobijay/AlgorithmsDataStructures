package Recursion;

/**
 * Created by jmobijoh on 11/5/17.
 */
public class Count {

    private int number = 0;

    public int count(int number) {
        if(number == 10) {
            System.out.println("Count " + number);
            return number;
        }
        System.out.println("Count " + number);
        number++;
        return count(number);
    }
}
