package Stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jmobijoh on 11/3/17.
 */
public class Stack {

    private int top = -1;
    private List<Integer> integerList = new ArrayList<Integer>();

    public void push(int element) {
        integerList.add(++top, element);
    }

    public int pop() {
        return integerList.remove(top--);
    }

    public int getTop() {
        return integerList.get(top);
    }

}
