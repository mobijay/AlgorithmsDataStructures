package Queue;

import LinkedList.LinkedList;
import LinkedList.Node;

/**
 * Created by jmobijoh on 11/3/17.
 */
public class QueueLinkedListImpl {
    LinkedList linkedList = new LinkedList();

    public void enqueue (String data) {
        Node newNode = new Node(data);
        linkedList.addNode(newNode);
    }

    public String dequeue() {
        Node node = linkedList.getNode(0);
        linkedList.removeNode(0);
        return node.getData();
    }

}
