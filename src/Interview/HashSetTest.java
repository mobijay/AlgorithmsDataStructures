package Interview;

import java.util.*;

/**
 * Created by jmobijoh on 11/6/17.
 */
public class HashSetTest {

    public static void main(String[] args) {
        int[] arrayTest = {0, 14, 0, 4, 7, 8, 3, 5, 7};

        printPairsUsingSet(arrayTest, 7);


    }

    public static void printPairsUsingSet(int[] numbers, int n) {
        if(numbers.length < 2){
            return;
        }

        Set set = new HashSet(numbers.length);
        for(int value : numbers){
            int target = n - value; // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);
            } else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }

}
