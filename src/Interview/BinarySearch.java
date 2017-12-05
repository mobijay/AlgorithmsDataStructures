package Interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jmobijoh on 11/6/17.
 */
public class BinarySearch {


    public int binarySearch(int numberToFind, List<Integer> listToSearch) {

        int rightArrSize = listToSearch.size() - 1;
        int leftArrSize = 0;

        while (leftArrSize <= rightArrSize) {

            int middle = leftArrSize + ((rightArrSize - leftArrSize)/2);

            if(numberToFind == listToSearch.get(middle)) {
                return listToSearch.get(middle);
            }

            if(numberToFind > listToSearch.get(middle)) {
                leftArrSize = middle + 1;
            }

            if(numberToFind < listToSearch.get(middle)) {
                rightArrSize = middle - 1;
            }
        }

        return -1;
    }
}
