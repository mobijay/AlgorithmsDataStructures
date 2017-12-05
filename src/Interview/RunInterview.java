package Interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jmobijoh on 11/6/17.
 */
public class RunInterview {

    public static void main(String[] args) {

        List listOfSortedIntegers = new ArrayList();
        listOfSortedIntegers.add(1);
        listOfSortedIntegers.add(4);
        listOfSortedIntegers.add(9);
        listOfSortedIntegers.add(10);
        listOfSortedIntegers.add(12);
        listOfSortedIntegers.add(20);
        listOfSortedIntegers.add(22);
        listOfSortedIntegers.add(25);
        listOfSortedIntegers.add(28);
        listOfSortedIntegers.add(30);

        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(32, listOfSortedIntegers));

        List<Integer> listOfUnSortedIntegers = new ArrayList<Integer>();
        listOfUnSortedIntegers.add(12);
        listOfUnSortedIntegers.add(10);
        listOfUnSortedIntegers.add(4);
        listOfUnSortedIntegers.add(9);
        listOfUnSortedIntegers.add(1);
        listOfUnSortedIntegers.add(28);
        listOfUnSortedIntegers.add(30);
        listOfUnSortedIntegers.add(20);
        listOfUnSortedIntegers.add(22);
        listOfUnSortedIntegers.add(25);

        int smallest = listOfUnSortedIntegers.get(0);
        int largest = listOfUnSortedIntegers.get(0);
        for(int i =0; i < listOfUnSortedIntegers.size(); i++) {
            if(smallest > listOfUnSortedIntegers.get(i)) {
                smallest = listOfUnSortedIntegers.get(i);
            }

            if(largest < listOfUnSortedIntegers.get(i)) {
                largest = listOfUnSortedIntegers.get(i);
            }
        }

        System.out.println("Smallest: " + smallest + " Largest " + largest);


    }
}
