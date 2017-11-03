package LinkedList;

/**
 * Created by jmobijoh on 10/27/17.
 */
public class Run {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList("My first Linked List");
        myLinkedList.addNode(new Node("2nd Node"));
        myLinkedList.printNodeData();
        System.out.println("Size of Linked List: " + myLinkedList.size());
        System.out.println("Get Node: " + myLinkedList.getNode(1).getData());

        System.out.println("Remove node");
        myLinkedList.removeNode(1);
        System.out.println("Size of Linked List: " + myLinkedList.size());
        myLinkedList.printNodeData();


    }
}
