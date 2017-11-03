package Stack;

/**
 * Created by jmobijoh on 11/3/17.
 */
public class StackRun {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Pop " + stack.pop());
        System.out.println("Top " + stack.getTop());
    }
}
