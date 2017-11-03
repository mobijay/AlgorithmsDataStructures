package LinkedList;

/**
 * Created by jmobijoh on 10/27/17.
 */
public class LinkedList {

    private Node head = null;
    private int size = 0;

    public void addNode(Node newNode) {

        if(head == null) {
            head = newNode;
            size++;
            return;
        }
        Node currentNode = head;

        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
        size++;
    }

    public void removeNode(int index) {
        if(index < 0 || index > size()) {
            System.out.println("No node to remove");
        } else {
            Node currentNode = head;

            //Remove Head Node
            if(index == 0) {
                if(currentNode.getNext() != null) {
                    head = currentNode.getNext();
                } else {
                    head = null;
                }
                size--;
                return;
            }

            Node previousNode = head;
            for(int i = 1; i < size; i++) {
                if(currentNode.getNext() == null) {
                    //Remove last node
                    previousNode.setNext(null);
                    size--;
                    return;
                } else if(i == index) {
                    //Remove any node
                    previousNode.setNext(currentNode.getNext());
                    size--;
                    return;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
        }
    }

    public void printNodeData() {
        Node currentNode = head;

        for(int index = 0; index < size; index++) {
            System.out.println("Node Data: " + currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

    public Node getNode(int index) {
        Node currentNode = head;

        if(index > size() || index < 0) {
            System.out.println("List is of size: " + size());
            return null;
        }

        for(int i = 0; i < size; i++) {
            if(i == index) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }

        return null;
    }

    public int size() {
        return size;
    }

}
